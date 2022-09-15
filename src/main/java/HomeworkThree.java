//user input
import java.util.Scanner;

public class HomeworkThree {

    public static void main(String[] args) {
        //Part 1: Program to ask how many pets someone has
        //Ask what kind of pet each one is
        //Ask pet name
        //Program should hold user input and print list

        //Declaring variables
        String petInfo;
        int numberOfPets;
        String petName;
        String howMany = "How many pets do you have?";
        String whatKind = "What kind?";
        String whatName = "What's the pet's name?";

        //Object
        Scanner userOne = new Scanner(System.in);
        System.out.println(howMany + " " + whatKind + " " + whatName);

        numberOfPets = userOne.nextInt();
        petInfo = userOne.nextLine();
        petName = userOne.nextLine();


        System.out.println(numberOfPets);
        System.out.println(petInfo);
        System.out.println(petName);



    }
}
