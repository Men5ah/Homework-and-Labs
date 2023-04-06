import java.util.Scanner; // Import the scanner class to enable taking input.

public class Lab1_Program1 {
    public static void main(String[] args) {
        //Print a prompt for positive numbers from the user.
        System.out.println("Enter a list of positive numebrs, one per line.");
        // Print ta prompt to tell the user that a negative number will end the program.
        System.out.println("Use a negative number to indicate the end of input");

        //Create a scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);
        //Read the input from the user.
        int userInputs = scanner.nextInt();

        //Declare and initialize variable to track the number of even, odd, and zero numbers.
        int even = 0;
        int odd = 0;
        int zeros = 0;

        //Take inputs while user input is positive.
        while (userInputs >= 0) {
            //Check if input equals 0.
            if (userInputs == 0) {
                zeros ++; // Increase 'zeros' variable by 1
            //Check if input is an even number.
            } else if (userInputs % 2 == 0) {
                even ++; //Increase 'even' variable by 1
            } else {
                odd ++; //Increase 'odd' variable by 1
            }
            userInputs = scanner.nextInt(); // Take another input from the user.
        }
        System.out.println("Thank you!");
        // Summary of how many even, odd, and zeros that the user input.
        System.out.println("You entered " + even + " even numbers, " + odd + " odd numbers, and " + zeros + " zeros.");
    // close the scanner.
    scanner.close();
    }

}
