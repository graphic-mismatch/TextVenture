import java.util.Scanner;

public class FightMechanics {
  public static void initBattle(String title) {
    interpret(title);
  }
  public static String[] interpret(String specs) {
    String cha = specs.substring(0, 9);
    String typ = specs.substring(9, 19);
    String lvl = specs.substring(19, specs.length());
    String[] datpack = { cha, typ, lvl };
    return datpack;
  }
  public static int[] statCalc(String[] data) {
    int[] stats = { 0, 0, 0, 0, 0, 0, 0, 0 };
    // maxhealth, charisma, atk, def, speed, evasion, gender(n,m,f), tamability
    // types: {"Skelly####", "Zombo#####", "Drac######", "Bot#######", "Gnome#####",
    // "RickAstely", "Stickbug##", "Doge######","Dwarf#####", "Dragon####",
    // "Snek######", "SnekV#####"}
    if (data[1].equals("Skelly####")) {
      System.out.println("I swear they have aimbot");
      stats[0] = 20 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round((Math.random() * 4) + 1)) * 1.5) + 10 ;
      stats[6] = 0;
      stats[7] = (int)(Math.round((Math.random()*50)+(Integer.parseInt(data[2])*0.1)));
    } 
    else if (data[1].equals("Zombo#####")) {
      System.out.println("uuuuhhhhhhhhuhuhuhh...");
      stats[0] = 17 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round((Math.random() * 2) + 1)) * 1.5);
      stats[6] = 0;
      stats[7] = 0;
    } 
    else if (data[1].equals("Drac######")) {
      System.out.println("I vill suk thine blood");
      stats[0] = 20 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round((Math.random() * 3) + 1)) * 1.5) + 4;
      stats[6] = (int)(Math.round((Math.random())+1));
      stats[7] = 0;
    }
    else if (data[1].equals("Bot#######")) {
      System.out.println("I fear no man... but the captcha? it scares me...");
      stats[0] = 25 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round(Math.random() + 1)) * 1.5) + 2;
      stats[6] = 0;
      stats[7] = (int)(Math.round((Math.random()*60)+(Integer.parseInt(data[2])*0.1)));
    } 
    else if (data[1].equals("Gnome#####")) {
      System.out.println("Get Gnomed!");
      stats[0] = 10 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round((Math.random() * 2.5) + 1)) * 1.5) + 3;
      stats[6] = (int)(Math.round((Math.random())+1));
      stats[7] = (int)(Math.round((Math.random()*30)+(Integer.parseInt(data[2])*0.1)));
    } 
    else if (data[1].equals("RickAstely")) {
      System.out.println(
          "Never gonna give you up\nNever gonna let you down\nNever gonna run around and desert you!\nNever gonna make you cry\nNever gonna say goodbye\nNever gonna tell a lie and hurt you!");
      stats[0] = 6 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round((Math.random() * 7) + 1)) * 1.5) + 10;
      stats[6] = 1;
      stats[7] = (int)(Math.round((Math.random()*10)+(Integer.parseInt(data[2])*0.1)));
    } 
    else if (data[1].equals("Stickbug##")) {
      System.out.println("Get sTickbUgGEd lol");
      stats[0] = 1 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round((Math.random() * 6) + 1)) * 1.5) + 9;
      stats[6] = (int)(Math.round((Math.random())+1));
      stats[7] = (int)(Math.round((Math.random()*70)+(Integer.parseInt(data[2])*0.1)));
    } 
    else if (data[1].equals("Doge######")) {
      System.out.println("Such Amaze\nMuch wow");
      stats[0] = 12 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round((Math.random() * 3) + 1)) * 1.5) + 2;
      stats[6] = (int)(Math.round((Math.random())+1));
      stats[7] = (int)(Math.round((Math.random()*80)+(Integer.parseInt(data[2])*0.1)));
    } 
    else if (data[1].equals("Dwarf#####")) {
      System.out.println("I got nothing, sry.");
      stats[0] = 9 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round((Math.random() * 4) + 1)) * 1.5) + 4;
      stats[6] = (int)(Math.round((Math.random())+1));
      stats[7] = (int)(Math.round((Math.random()*30)+(Integer.parseInt(data[2])*0.1)));
    } 
    else if (data[1].equals("Dragon####")) {
      System.out.println("But everything changed... when the fire nation attacked");
      stats[0] = 25 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round(Math.random() + 1)) * 1.5) + 1;
      stats[6] = (int)(Math.round((Math.random())+1));
      stats[7] = (int)(Math.round((Math.random()*10)+(Integer.parseInt(data[2])*0.1)));
    } 
    else if (data[1].equals("Snek######")) {
      System.out.println("Good Snek");
      stats[0] = 10 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round((Math.random() * 5) + 1)) * 1.5) + 6;
      stats[6] = (int)(Math.round((Math.random())+1));
      stats[7] = (int)(Math.round((Math.random()*55)+(Integer.parseInt(data[2])*0.1)));
    } 
    else if (data[1].equals("SnekV#####")) {
      System.out.println("Danger Noodle");
      stats[0] = 10 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round((Math.random() * 5) + 1)) * 1.5) + 6;
      stats[6] = (int)(Math.round((Math.random())+1));
      stats[7] = (int)(Math.round((Math.random()*45)+(Integer.parseInt(data[2])*0.1)));
    } 
    else {
      System.out.println("Oop, something went wrong... Here, fight this placeholder!");
      stats[0] = 17 + (int) Math.round(Integer.parseInt(data[2]) * (Math.round((Math.random() * 5) + 1)) / 2);
      stats[1] = 0;
      stats[2] = Next(0,100);
      stats[3] = Next(0,(int) Math.round(100-(stats[2]/2)));
      stats[4] = Next(0,(int) Math.round(100-(stats[3]/5)));
      stats[5] = (int) Math.ceil((Integer.parseInt(data[2]) + Math.round((Math.random() * 3) + 1)) * 1.5) + 5;
      stats[6] = 0;
      stats[7] = 0;
    }
    // if ()
    return stats;
  }

  static int Next(int i, int j) {
    return (int) (Math.random() * j) + i;
  }
}