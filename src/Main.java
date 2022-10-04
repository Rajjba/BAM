import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Friend myFriend = new Friend("David Martinez");
        Friend myEnemy = new Friend("Adam Smasher", false);

        System.out.println("\n" + "Welcome to Bash Adam Smasher!!");
        myFriend.SetHP(6000);
        myEnemy.SetHP(8000);

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
                    System.out.println("\n" + myFriend.name + " activates his military grade Sandevistan and move so fast that time slows down. " +
                            "\n" + "After delivering several blows David has dealt: 2000 DMG!" + "\n");
                    myEnemy.DMG(2000);
                    Sandevistan += 1;
                    if (Sandevistan >= 3) {
                        System.out.println(myFriend.name + " has used the Sandevistan too much." +
                                "\n" + "David took 3000 DMG!" + "\n");
                        myFriend.DMG(3000);
                    }
                    myEnemy.GetHP();
                    myFriend.GetHP();
                }
                else if (newChoice == 2) {
                    System.out.println("\n" + myFriend.name + " unleashes a Flurry of Blows!" +
                            "\n" + "David dealt: 500 DMG!" + "\n");
                    myEnemy.DMG(500);
                    myEnemy.GetHP();
                    myFriend.GetHP();
                }
                else if (newChoice == 3) {
                    System.out.println("\n" + myFriend.name + " tries to charm " + myEnemy.name + "..." + "\n" +
                            "It had no effect since " + myEnemy.name + " is an emotionless killing machine.");
                }
                System.out.println("After " + myFriend.name + " has landed his hit, " + myEnemy.name + " gets ready and DUNKS on " + myFriend.name + " with the strength of an unstoppable titan!" +
                        "\n" + myFriend.name + " is able to block in time but still took: 1000 DMG!" + "\n");
                myFriend.DMG(1000);
                myEnemy.GetHP();
                myFriend.GetHP();
                if(myFriend.GetHP() <= 0 || myEnemy.GetHP() <= 0){
                    loop = false;
                }
            }
        if(myFriend.GetHP() <= 0){
            System.out.println(myFriend.name + " died");
        }
        else if (myEnemy.GetHP() <= 0){
            System.out.println(myFriend.name + " beat Adam Smasher!!");
        }
    }
}