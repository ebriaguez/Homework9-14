//user input
import java.sql.SQLOutput;
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
//        Scanner userOne = new Scanner(System.in);
//        //Enter username
//        System.out.println(inputUser);
//
//        //Username enter will input
//        storedInfo = userOne.nextLine();


        //putting everything in a while loop to loop through the user input
        while (true){
            //creating a new object that is stored in userOne
            Scanner userOne = new Scanner(System.in);
            //print out inputUser
            System.out.println(inputUser);
            //store user input in storedInfo
            storedInfo = userOne.nextLine();
            //create an if statement to print only Alice or Bob
            if (storedInfo.equals("Alice") || storedInfo.equals("alice")){
                //sys out output message and storedInfo
                System.out.println(outputUser + storedInfo + "!");
                //break keyword to stop if conditions are met
                break;
                //continuing statements
            } else if (storedInfo.equals("Bob") || storedInfo.equals("bob")){
                System.out.println(outputUser + storedInfo + "!");
                break;
            } else {
                System.out.println(error);;
            }
        }
    }
}
