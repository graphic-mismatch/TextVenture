import java.io.*;
public class LoadAndDecrypt {
 
    public static String readData (String s) 
    { 
      String data = "";
        try {
            FileInputStream inputStream = new FileInputStream("Save.txt");
            InputStreamReader reader = new InputStreamReader(inputStream, "UTF-16");
            int character;
 
            while ((character = reader.read()) != -1) {
                data += Character.toString((char)character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        data = Decry(data);
        return data;
    }
  public static String Decry(String s)
    {
        s = antiXROT(s);
        s = antiNoise(s);
        s = antiDynaROT(s);
        return s;
    }

    static String  antiDynaROT(String s)
    {
        int x = 0;
        String a = Character.toString(s.toCharArray()[0]);
        for (int i = 1; i < s.length(); i++)
        {
            if (s.toCharArray()[i] != 32 && s.toCharArray()[i - 1] != 32)
            {
                x = (s.toCharArray()[i] - a.toCharArray()[i - 1]);
                a += Character.toString(((char)x));
            }
            else if (s.toCharArray()[i] == 32)
            {
                a += " ";
            }
            else
            {

                a += Character.toString(s.toCharArray()[i]);
            }

        }
        return a;
    }

    static String  antiXROT(String s)
    {
        int key = Integer.parseInt(Character.toString((s.toCharArray()[0])));
        String t = "";
        long x = 0;
        for (int i = 1; i < s.length(); i++)
        {
            t += Character.toString(s.toCharArray()[i]);
        }
        String a = "";
        for (int i = 0; i < t.length(); i++)
        {
            if (t.toCharArray()[i] != 32)
            {
                x = (t.toCharArray()[i] - key);
                a += Character.toString(((char)x));
            }
            else
            {
                a += " ";
            }
        }
        return a;
    }

    static String  antiNoise(String s)
    {
        int key1 = Integer.parseInt(Character.toString((s.toCharArray()[0]))) + 2;
        int key2 = Integer.parseInt(Character.toString((s.toCharArray()[1])));
        String a = s.substring(key1);
        a = a.substring(0, (a.length() - key2));
        return a;
    }
    
}
