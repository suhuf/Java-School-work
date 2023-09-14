

/* This program takes two values and then calculates them depending on the operator

 */


import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        while (true) { // This while loop is placed here so I can make the program re-run if the user inputs are wrong
            //... (Some times)

            Scanner sc_int = new Scanner(System.in); // Used to reference user input, in this case is for integers
            Scanner sc_string = new Scanner(System.in);
            char verify = 1; // This verify variable is used to cause a re-loop if the variable is equal to 0 later on

            // Having a number that is not between 200 and 1000 will cause verify to be set to 0 instead of 1

            System.out.print("Enter two integer numbers between 200 and 1000 separated by a space: ");

            int Input_1 = sc_int.nextInt(); // Saves input to a specified variable for later reference
            int Input_2 = sc_int.nextInt();

            if ((Input_1 <= 1000 & Input_1 >= 200) & (Input_2 <= 1000 & Input_2 >= 200))
            { } // This if condition stipulates that both input 1 and input 2 have to be between 200 and 1000 to proceed
            //... If it is not then instead of just proceeding, it will go to an else statement

            else{
                System.out.println("Your numbers need to be between 200 and 1000");
            verify = 0; } // The else statement here prompts the user to what their error was, the verify variable here...
            //... Stipulates that if the numbers do not fit the conditions, its value is turned to 0


            if (verify == 0) {continue; } // Here the verify variable is checked, if it is at 0 the program restarts ...
            // To the beginning of the while loop

            System.out.print("Enter operation symbol (+, -, *, or /): ");
            String op_sym = sc_string.next(); // Acts as a prompt for the desired operator symbol


            if (op_sym.equals("+") ||
                    op_sym.equals("*") ||
                    op_sym.equals("-") ||
                    op_sym.equals("/")) {
            } else {
                System.out.println("Not valid operation symbol");
            } /* This is similar to the algorithm specified above, if the operator is +, -, *, or /, the program will ...
            ... Proceed. If not, the program will notify them they did not choose a valid operation symbol and ...
            ... Loops to the start */


            if (op_sym.equals("+")) {
                float total = Input_1 + Input_2;
                System.out.println("Evaluation : " + Input_1 + " + " + Input_2 + " = " + total);
            break ;} // Adds the two pre-ordained values if the operator is set to +, break is used to not cause a loop ...
            // ... And end the program

            if (op_sym.equals("-")) {
                float total = Input_1 - Input_2;
                System.out.println("Evaluation : " + Input_1 + " - " + Input_2 + " = " + total);
            break ;} // Subtracts the two pre-ordained values if the operator is set to -, break is used to not cause a loop ...
            // ... And end the program

            if (op_sym.equals("*")) {
                float total = Input_1 * Input_2;
                System.out.println("Evaluation : " + Input_1 + " * " + Input_2 + " = " + total);
            break ;} // Multiplies the two pre-ordained values if the operator is set to *, break is used to not cause a loop ...
            // ... And end the program

            if (op_sym.equals("/")) {
                 double total = (double) Input_1 / Input_2;
                System.out.println("Evaluation : " + Input_1 + " / " + Input_2 + " = " + total);
            break ;} // Divides the two pre-ordained values if the operator is set to /, break is used to not cause a loop ...
            // ... And end the program. This one specifically needs double to be set instead of integer because of java
            // Truncating integer values


        }
        String date = "3/8/22"; //Submission requirement
        String course = "CMIS 141"; //Submission requirement
        System.out.println("\n" + date + " " + course);
        //Submission requirement
        }
}