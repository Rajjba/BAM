import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Friend myFriend = new Friend("David Martinez");
        Friend myEnemy = new Friend("Adam Smasher", false);

        System.out.println("\n" + "Welcome to Bash Adam Smasher!!");
        myFriend.SetHP(6000);
        myEnemy.SetHP(8000);

        int Sandevistan = 0;
        while(myFriend.GetHP() > 0 || myEnemy.GetHP() > 0) {
            System.out.println("\n" + myFriend.name + ": " + myFriend.GetHP());
            System.out.println(myEnemy.name + ": " + myEnemy.hp);
            System.out.println("\n" + myFriend.name + " has three moves: " + "\n" +
                    "1. Sandevistan Dance" + "\n" +
                    "2. Flurry of Blows" + "\n" +
                    "3. Charm" + "\n");
            Scanner choice = new Scanner(System.in);
            int newChoice = choice.nextInt();
            if (newChoice == 1) {
                System.out.println("\n" + myFriend.name + " activates his military grade Sandevistan and move so fast that time slows down. " +
                        "\n" + "After delivering several blows David has dealt: 2000 DMG!" + "\n");
                myEnemy.DMG(2000);
                Sandevistan += 1;
            }
            if (newChoice == 2) {
                System.out.println("\n" + myFriend.name + " unleashes a Flurry of Blows!" +
                        "\n" + "David dealt: 500 DMG!" + "\n");
                myEnemy.DMG(500);
            }
            if (newChoice == 3) {
                System.out.println("\n" + myFriend.name + " tries to charm " + myEnemy.name + "..." + "\n" +
                        "It had no effect since " + myEnemy.name + " is an emotionless killing machine.");
            }
            if (Sandevistan == 3){
                System.out.println(myFriend.name + " has used the Sandevistan too much." +
                        "\n" + "David took 3000 DMG!");
                myFriend.DMG(3000);
            }
            System.out.println(myEnemy.name + " DUNKS on " + myFriend.name + " with the strength of an unstoppable titan!" +
                    "\n" + myFriend.name + " is able to block in time but still took: 1000 DMG!" + "\n");
            myFriend.DMG(1000);
        }
        if(myFriend.GetHP() <= 0){
            System.out.println("\n" + myFriend.name + " died");
        }
        if(myEnemy.GetHP() <= 0){
            System.out.println("\n" + myFriend.name + " beat Adam Smasher!!");
        }
    }
}