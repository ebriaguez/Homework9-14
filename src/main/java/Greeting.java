//user input
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        //GOAL: receive users name
        //Greet with their names for Alice and Bob ONLY

        //declaring variables
        String storedInfo;
        String inputUser = "Username: ";
        String outputUser = "Welcome ";
        String error = "Error: not valid user";


        //Object
        Scanner userOne = new Scanner(System.in);
        //Enter username
        System.out.println(inputUser);

        //Username enter will input
        storedInfo = userOne.nextLine();

        if (storedInfo.equals("Alice") || storedInfo.equals("alice")){
            System.out.println(outputUser + storedInfo + "!");
        } else if (storedInfo.equals("Bob") || storedInfo.equals("bob")){
            System.out.println(outputUser + storedInfo + "!");
        } else {
            System.out.println(error);;
        }
    }
}
