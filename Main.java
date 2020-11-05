import java.util.Scanner;
public class Main extends Game
{
  public static void main(String[] argv)
  {
    Game.slowType("     ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄       ▄  ▄▄▄▄▄▄▄▄▄▄▄\n    ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌     ▐░▌▐░░░░░░░░░░░▌\n     ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀  ▐░▌   ▐░▌  ▀▀▀▀█░█▀▀▀▀\n         ▐░▌     ▐░▌            ▐░▌ ▐░▌       ▐░▌\n         ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄    ▐░▐░▌        ▐░▌\n         ▐░▌     ▐░░░░░░░░░░░▌    ▐░▌         ▐░▌\n         ▐░▌     ▐░█▀▀▀▀▀▀▀▀▀    ▐░▌░▌        ▐░▌\n         ▐░▌     ▐░▌            ▐░▌ ▐░▌       ▐░▌\n         ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄  ▐░▌   ▐░▌      ▐░▌\n         ▐░▌     ▐░░░░░░░░░░░▌▐░▌     ▐░▌     ▐░▌\n          ▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀       ▀       ▀\n\n\n          __      __        _                  \n          \\ \\    / /       | |                 \n           \\ \\  / /__ _ __ | |_ _   _ _ __ ___ \n            \\ \\/ / _ \\ '_ \\| __| | | | '__/ _ \\\n             \\  /  __/ | | | |_| |_| | | |  __/\n              \\/ \\___|_| |_|\\__|\\__,_|_|  \\___|", 7);

    System.out.println("==============================================================\n");
    Scanner get = new Scanner(System.in);
    Game.slowType(Game.spawnMonster(), 100); 
    System.out.println("Press Enter to Continue:");
    get.nextLine();
    Game.cls();
    
  }
}