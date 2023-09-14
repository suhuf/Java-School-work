/*
Author: Mulai Stewart
3/29/2022

Program is used to compute 3 different conversion options. Miles to Km, GPA to Honors title, and Cubic feet
to U.S. Bushel

*/


import java.util.Scanner;

class Scratch {

    public static double Miles2Km(double x) { // Saves a Method as Miles2Km, what ever is put in place of ...
    double z = x * 1.60934;  // ... x is converted from miles to km. Z is returned.
        return z;

    }
    public static float sq2yard(float x) { // Square feet to cubic Yards
        float z = x/9 ;

        return z;
    }
    public static String GradeTitle(float x) { // Determine Grade title, 3.5 - 3.7; 3.8 - 3.9; 4.0+.

        String z = " " ;

         if (x >= 4.0 ){
             z = "Summa Cum Laude";
         }
         if (x >= 3.8 && x <= 3.9 ){
             z = "Magna Cum Laude";
         }
         if (x >= 3.5 && x <= 3.7 ){
             z = "Cum Laude";
         }
         // Gives a respective string to the GPA range input as x, this Method is saved as GradeTitle
        // Z is returned

        return z;
    }
    public static int Height2Meters(int x) { // Converts height from inches to meters
        return x;
    }

    public static double Cubic2Bush(double x) {
       double z = x*0.803564;

       // Saves the Method Cubic2bush as a conversion for whatever replaces x, the answer (z) is returned

        return z;
    }


    public static void main(String[] args) {
        Scanner Sc_int = new Scanner(System.in);  // These are used to initiate user input later on
        Scanner Sc_float = new Scanner(System.in);
        Scanner Sc_double = new Scanner(System.in);

        int init = 0; // Used to keep the program within a while loop and also exit later on

        while (init <= 0) { // Until someone presses 9 specifically the program infinitely loops what is below
            System.out.println();
            System.out.println();

            System.out.println("    " + "MENU\n" +
                    "1: Convert cubic feet to U.S. bushels\n" +
                    "2: Convert miles to kilometers\n" +
                    "3: Determine graduation title with honors\n" +
                    "9: Exit program"); // Prompts with spaces for accuracy

            System.out.print("Enter your selection: ");
            int Select = Sc_int.nextInt(); // Saves the int "Select" as a user's input
            if (Select == 9) {
                System.out.println("Thank you for using the program. Goodbye!");
                break; // If the user selected 9 the while loop breaks and the Program ends
            }
            if (Select == 1) { // If 1 is selected, this sequence begins
                System.out.print("Enter cubic feet: ");
                double c_Ft = Sc_double.nextDouble(); // Saves user input as c_Ft and as a double
                double Bushels = Cubic2Bush(c_Ft); // Calls the Method Cubic2Bush, refer to respective Method for more ...
                // ...information
                System.out.print(c_Ft + " cubic ft. = " + Bushels + " U.S. bushels");
                // Prints with respective variables

            }

            if (Select == 2) { // If 2 is Selected, this sequence begins
                System.out.print("Enter miles: ");
                double Miles = Sc_double.nextDouble(); // Saves user input as a double
                double km = Miles2Km(Miles); // Calls the Method Miles2Km for the above input, refer to respective ...
                // Method for more information
                System.out.print(Miles + " miles = " + km + " km");
                // Prints

            }

            if (Select == 3) { // if 3 is Selected, this sequence begins
                System.out.print("Enter GPA: ");
                float GPA = Sc_float.nextFloat(); // Saves GPA as a float value
                String Title = GradeTitle(GPA); // Calls the Method GradeTitle, refer to respective Method for more...
                // ... Information, this method uses the previous user input
                System.out.println("Congratulations, you have graduated " + Title + " !");

            }
        }

        String date = "3/29/22"; //Submission requirement
        String course = "CMIS 141"; //Submission requirement
        System.out.println("\n" + date + " " + course);
        //Submission requirement
    }

}