import java.util.Scanner; // import Scanner class to take a user input
public class TemperatureConverter {
    public static void main(String[] args) {
        // Scanner object to read input
        Scanner input = new Scanner(System.in);

        // declare variables
        String a = "a";
        String b = "b";

        // display prompt to user
        System.out.println("Choose 1, a. Convert Celsius to Fahrenheit. b. Convert Fahrenheit to Celsius.");
        // read the entire line of text as a string
        String userOption = input.nextLine().toLowerCase();

        // Ask the user for temperature value
        // display prompt to user
        System.out.println("Enter temperature value");
        // read the entire line of text as a double
        double tempValue = input.nextDouble();

        // initialize answer for convention of Celsius to Fahrenheit or to convert Fahrenheit to Celsius
        double answer;

        // check if the choice is valid
        if(userOption.equals(a)){
            // convert celsius to fahrenheit
            answer = (tempValue * 9/5) + 32;
            System.out.println("Celsius to Fahrenheit is " + answer);
        }
        else if(userOption.equals(b)){
            // convert fahrenheit to celsius
            answer = (tempValue - 32) * 5/9;
            System.out.println("Fahrenheit to Celsius is " + answer);
        }
        else{
            // when users choice is not valid
            System.out.println("Invalid option");
        }
        // close scanner class
        input.close();
    }
}
