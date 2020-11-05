import java.io.*;

public class SaveAndEncrypt {
  public static void writeData(String s) throws IOException {
    try {
      FileOutputStream outputStream = new FileOutputStream("save.txt");
      OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
      BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
      bufferedWriter.write(Encry(s));
      bufferedWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static String Encry(String s) {
    s = dynaROT(s);
    s = noise(s);
    s = xROT(s);
    return s;
  }

  static String dynaROT(String s) {
    long x = 0;
    String a = Character.toString(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) != 32 && s.charAt(i - 1) != 32) {
        x = (s.charAt(i) + s.charAt(i - 1));
        a += Character.toString((char) x);
      } else if (s.charAt(i) == 32) {
        a += " ";
      } else {

        a += Character.toString(s.charAt(i));
      }
    }
    return a;
  }

  static String xROT(String s) {
    int key = Next(0, 9);
    long x = 0;
    String a = Integer.toString(key);
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != 32) {
        x = (s.charAt(i) + key);
        a += Character.toString((char) x);
      } else {
        a += " ";
      }
    }
    return a;
  }

  static String noise(String s) {
    int key1 = Next(1, 10);
    int key2 = Next(0, 10);
    String a = "" + Integer.toString(key1) + "" + Integer.toString(key2);
    for (int i = 0; i < key1; i++) {
      a += Character.toString(((char) Next(65, 123)));
    }
    a += s;
    for (int i = 0; i < key2; i++) {
      a += Character.toString(((char) Next(65, 123)));
      ;
    }
    return a;
  }

  static int Next(int i, int j) {
    return (int) (Math.random() * j) + i;
  }
}
