import java.util.Scanner;
import java.util.Random;
public class FightMechanics {
    public static Scanner get =  new Scanner(System.in);
    static Random rand = new Random();
    public static void initBattle(String title) {
        fight(statCalc(interpret(title)));
    }

    public static String[] interpret(String specs) {
        String cha = specs.substring(0, 9);
        String typ = specs.substring(9, 19);
        String lvl = specs.substring(19, specs.length());
        String[] datpack = { cha, typ, lvl };
        return datpack;
    }

    public static boolean fight(int[] data)
    {
        int[] stats = data;
        System.out.println("Select Action: \n1.Attack\n2.Charm\n3.Settle It Like Those Bruhssians\n4.Yeet Yourself Out Of Battle");
        String opt = get.nextLine();
        switch(opt)
        {
            case "1":

        }
        return true;
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
            if(Game.Next(1,1000) != 15)
            {
                System.out.println("I vill suk thine blood!");
            }
            else{
                System.out.println("U arent a vampire," + (Next(1,100)%2 == 0?" reference nobody will see 1":"reference nobody will understand 2"));
            }
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
            System.out.println("Nom Nom\nSnom is\nThe best Pokemon");
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

    public static void rRoulette(String nam, String opp) {
        int ch = rand.nextInt(6) + 1;
        System.out.println("Welcome to the Russian Roulette Minigame!");
        System.out.println("The game will start in:");
        for (int i = 3; i >= 1; i--) {
            Game.delay(1000);
            System.out.println(i);
        }
        System.out.println("The bullet is in the chamber and it is spun.");
        Game.delay(2000);
        String name;
        for (int i = 1; i <= ch; i++) {
            if (i % 2 == 0)
                name = nam;
            else
                name = opp;
            System.out.println(name + " picks up the gun, and slowly pulls the trigger...");
            Game.delay(4000);
            if (i == ch) {
                System.out.println("BANG!!");
                Game.delay(2000);
                System.out.println(name + " died.");
                break;
            } else {
                System.out.println("CLICK!!");
                Game.delay(1000);
                System.out.println(name + " puts the gun on the table...");
            }
            Game.delay(1000);
        }
    }

    static int Next(int i, int j) {
        return (int) (Math.random() * j) + i;
    }

    public static long optGen(int n)
    {
        String binrep = "";
        boolean last = n%2 == 0;
        while(true)
        {
            if(n == 0 && last)
            {
                binrep += "0";
                break;
            }

            binrep += Integer.toString(n%2);
            if (n==0)
            {
                break;
            }
            n = n>>1;
        }
        binrep = rev(binrep);
        return Long.parseLong(binrep);
    }

    public static int OVkRand() {
        Random random = new Random();
        int seed1 = Integer.parseInt((""+System.currentTimeMillis()).substring(9)); //seed
        int seed2 = Integer.parseInt((""+System.nanoTime()).substring(11));  //seed
        long seedMain = Math.abs((seed1*seed2)-(seed1)-0x5F3);  //wtf
        seedMain = seedMain>>10;   //fast reduction
        seedMain = Math.abs(Integer.parseInt((""+seedMain).substring((""+seedMain).length()-2))); //random bs
        int x = random.nextInt(Math.abs(seed2-seed1))+seed1;
        seedMain = seedMain>>10;  //fast reduction
        x = x>>5;  //fast reduction
        return random.nextInt(x-Math.abs((int)seedMain))+Math.abs((int)seedMain);
    }

    public static String rev(String s)
    {
        String t = "";
        for (int i =  s.length()-1; i>=0; i--)
        {
            t += ""+s.charAt(i);
        }
        return t;
    }
}