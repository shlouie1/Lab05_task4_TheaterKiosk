import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initialize variables and scanner object
        Scanner userInput = new Scanner(System.in);
        int userAge = 0;

        //user input for their age
        System.out.print("What is your age: ");
        userAge = userInput.nextInt();

        //checks if they are 21 or older and outputs whether or not they get a band
        if (userAge >= 21) {
            System.out.println("You get a wrist band!");
        }
        //does nothing if not 21 or older, as specified

    }
}