import java.util.Scanner; // Import the scanner class to enable taking input.

public class Lab1_Program2 {
    public static void main(String[] args){
        // Creating a scanner class to get input from the user.
        Scanner scanner = new Scanner(System.in);
        // Prompt asking for how many courses the user took.
        System.out.println("How many courses did you take last semester?");
        int numberOfCourses = scanner.nextInt(); // Take user input.

        // Declare and Initialize variables to track total number of points earned and total credits for the courses.
        float totalPoints = 0;
        float totalCredits = 0;

        // Loop through the number of courses taken.
        for (int i = 1; i <= numberOfCourses; i ++){
            System.out.println("How many credits was course " + i); // Ask how many credits the course was worth.
            float creditAmount = scanner.nextFloat(); // Take an input.

            System.out.println("What was you letter grade?"); //Ask for the letter grade for that course.
            String letterGrade = scanner.next(); // Take another input.

            double points = 0.0; // Declare and Initialize a variable to store the points for the letter grades.

            //Use an if...else block to convert letter grades to points stored in 'points' variable.
            if (letterGrade.equals("A+") ){
                 points = 4.0;
            }
            else if (letterGrade.equals("A") ){
                 points = 4.0;
            }
            else if (letterGrade.equals("B+")){
                 points = 3.5;
            }
            else if (letterGrade.equals("B")){
                 points = 3.0;
            }
            else if (letterGrade.equals("C+")){
                 points = 2.5;
            }
            else if (letterGrade.equals("C")){
                 points = 2.0;
            }
            else if (letterGrade.equals("D+") ){
                 points = 1.5;
            }
            else if (letterGrade .equals("D")){
                 points = 1.0;
            }
            else{
                 points = 0.0;
            }

            totalCredits += creditAmount; // Sum of credits.
            totalPoints += (points *creditAmount); // Calculate total points.
        }
        
        double gradePointAverage = totalPoints/totalCredits; // Calculate the GPA

        System.out.println("You took "+ totalCredits + " credits."); // Print the total credits for number of courses taken
        System.out.println("Your semester GPA was " + gradePointAverage); // Print final GPA

    //Close the scanner.
    scanner.close();
    }
}
