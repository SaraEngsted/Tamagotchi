import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        // inspo fra Søs
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there and welcome to Tamagotchi! Please start the game by choosing between a cat or a dog 😎");
        System.out.println("\n 1. for dog 🐶 or \n 2. for cat 🐱 ");

        int dogOrCat = scanner.nextInt();
        scanner.nextLine();

        //If Dog
        if (dogOrCat == 1) {

            System.out.println("It is a dog! What is the name of your new dog?");
            String dogsName = scanner.next();

            System.out.println("Nice name! And how old is " + dogsName + "?");
            int dogsAge = scanner.nextInt();

            System.out.println("Please enter how much energy your dog has from the start of the game");
            System.out.println("You can only choose from 0-10");
            int dogsEnergy = scanner.nextInt();

            System.out.println("Okay, and now what color is " + dogsName + "?");
            String dogsColor = scanner.next();

            System.out.println("What does " + dogsName + " say?");
            String dogSound = scanner.next();
            System.out.println("\n");



            Dog dog = new Dog(dogsName, dogsAge, dogsEnergy, dogsColor, dogSound);
            System.out.println("Here is your new dog! Say hi to " + dogsName + "!");
            dog.printDogsDetail();
            System.out.println("Get ready to play!");
            System.out.println("\n");

            for (int i = 0; i < 10; i++) {

                System.out.println(dogSound + "What would you like to do?");
                System.out.println("\n 3. feed \n 4. play games \n 5. sleep \n 6. give bath \n 7. roll around");
                int gameOption = scanner.nextInt();

                if (gameOption == 3) {
                    dog.feed();
                } else if (gameOption == 4) {
                    dog.playGames();
                } else if (gameOption == 5) {
                    dog.putToBed();
                } else if (gameOption == 6) {
                    dog.giveBath();
                } else if (gameOption == 7) {
                    dog.rollAround();
                }
                System.out.println("\n");

            }

            //If Cat
        } else if (dogOrCat == 1) {

            System.out.println("It is a Cat! What is the name of your new cat?");
            String catsName = scanner.next();

            System.out.println("Nice name! And how old is " + catsName + "?");
            int catsAge = scanner.nextInt();

            System.out.println("Please enter how much energy your cat has from the start of the game");
            System.out.println("You can only choose from 0-10");
            int catsEnergy = scanner.nextInt();

            System.out.println("Okay, and now what color is " + catsName + "?");
            String catsColor = scanner.next();

            System.out.println("What does " + catsName + " say?");
            String catSound = scanner.next();

            System.out.println("Beautiful! And last question - what is the cats sex?");
            String catsSex = scanner.next();


            Cat cat = new Cat(catsName, catsAge, catsEnergy, catsColor, catSound);
            System.out.println("Here is your new cat! Say hi to " + catsName + "!");
            cat.printCatsDetail();
            System.out.println("Get ready to play!!");
            System.out.println("\n");

            for (int i = 3; i < 7; i++) {

                System.out.println(catSound + "What would you like to do?");
                System.out.println("\n 3. feed \n 4. play games \n 5. sleep \n 6. give bath");
                int gameOption = scanner.nextInt();

                if (gameOption == 3) {
                    cat.feed();
                } else if (gameOption == 4) {
                    cat.playGames();
                } else if (gameOption == 5) {
                    cat.putToBed();
                } else if (gameOption == 6) {
                    cat.giveBath();
                } else if (gameOption == 7) {
                    cat.CatchMouse();
                }
                System.out.println("\n");

            }

        } else {
            System.out.println("Please choose between the numbers 1 or 2...");

        }
    }
}
