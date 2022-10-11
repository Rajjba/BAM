import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        Friend myFriend = new Friend("David Martinez");
        Friend myEnemy = new Friend("Adam Smasher", false);

        System.out.println("\n" + "Welcome to Bash Adam Smasher!!");
        myFriend.SetHP(600);
        myEnemy.SetHP(900);

        boolean loop = true;

        int Sandevistan = 0;
            while (loop == true) {
                System.out.println("\n" + myFriend.name + ": " + myFriend.hp);
                System.out.println(myEnemy.name + ": " + myEnemy.hp);
                System.out.println("\n" + myFriend.name + " has three moves: " + "\n" +
                        "1. Sandevistan Dance" + "\n" +
                        "2. Flurry of Blows" + "\n" +
                        "3. Charm" + "\n");
                Scanner choice = new Scanner(System.in);
                int newChoice = choice.nextInt();
                if (newChoice == 1) {
                    Sandevistan += 1;
                    if(Sandevistan < 3) {
                        System.out.println("\n" + myFriend.name + " activates his military grade Sandevistan and move so fast that time slows down. " +
                                "\n" + "After delivering several blows David has dealt: 300 DMG!" + "\n");
                        myEnemy.DMG(300);
                    }
                    else if(Sandevistan >= 3) {
                        System.out.println(myFriend.name + " has used the Sandevistan too much." +
                                "\n" + "David took 200 DMG!" + "\n");
                        myFriend.DMG(200);
                    }
                }
                else if (newChoice == 2) {
                    System.out.println("\n" + myFriend.name + " unleashes a Flurry of Blows!" +
                            "\n" + "David dealt: 150 DMG!" + "\n");
                    myEnemy.DMG(150);
                }
                else if (newChoice == 3) {
                    System.out.println("\n" + myFriend.name + " tries to charm " + myEnemy.name + "..." + "\n" +
                            "It had no effect since " + myEnemy.name + " is an emotionless killing machine.");
                }
                if(myFriend.GetHP() > 100) {
                    System.out.println("After " + myFriend.name + " has landed his hit, " + myEnemy.name + " gets ready and DUNKS on " + myFriend.name + " with the strength of an unstoppable titan!" +
                            "\n" + myFriend.name + " is able to block in time but still took: 100 DMG!");
                }
                else if(myFriend.GetHP() <= 100) {
                    System.out.println(myEnemy.name + " obliterates " + myFriend.name + " and leaves nothing behind.");
                }
                myFriend.DMG(100);

                drawWindow(myFriend, myEnemy);

                if(myFriend.GetHP() <= 0 || myEnemy.GetHP() <= 0){
                    loop = false;
                }
            }
        if(myFriend.GetHP() <= 0){
            System.out.println("\n" + myFriend.name + " died");
        }
        else if (myEnemy.GetHP() <= 0){
            System.out.println("\n" + myFriend.name + " beat Adam Smasher!!");
        }
    }
        public static void drawWindow(Friend myFriend, Friend myEnemy) {
            JFrame frame = new JFrame("Healthbar"); //create the window
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set action on closing window
            Healthbar healthbar = new Healthbar(myFriend, myEnemy); //Create the canvas
            healthbar.setPreferredSize(new Dimension(900, 600));
            frame.getContentPane().add(healthbar); // add the canvas to the frame
            frame.pack(); // Package everything
            frame.setVisible(true); //make everything visible
        }
}
