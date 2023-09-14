/*
Author: Mulai Stewart
4/5/2022

This program stores both the scores and the names of a set of teams in an array, it then calculates the lowest
scoring team and the highest scoring team
*/

import java.util.Scanner;

class Scratch {

    public static int Max_val( int [] A){ // This method is used to Calculate the highest value in an array

        int max; // Used to reference the largest number seen in an array (yet)
        int T_max = 0; // This is will be used to store the index value, this is important to be able to reference...
        // ... A teams' name in a separate array

        max = A[0]; // This statement is only a placeholder, but is not strictly true

        for ( int i = 0; i < A.length; i++ ) {  // As long as i is less than the arrays' length, loop through the ...
            //... Arrays' values

            if (A[i] > max) {

                max = A[i]; // If the number is greater than the last number, store this value as the highest value

                T_max = i; // If the number is greater than the last number, store the number's index position
            }
        }
        return T_max; // The index was returned instead of the value as it is more useful in this case, it can be used ...
        // ... In reference to 2 different arrays rather than 1.
    }
    public static int Min_val(int [] A){ // Same as above but for the lowest value
        int min;
        int T_min = 0; // Placeholder

        min = A[0]; // Place holder
        for(int i = 0; i < A.length; i++ ){ // As long as i is less than the arrays' length, loop through the ...
            //... Arrays' values
            if (A[i] < min) {

           min = A[i]; // If the reached value is less than the last minimum, make it the new minimum

            T_min = i; } // Store the address of this value

        }
        return T_min; // Return the address of this value
    }

    public static void main(String[] args) {
        Scanner sc_int = new Scanner(System.in); // Makes a command that calls for input
        Scanner sc_string = new Scanner(System.in);

        System.out.print("How many teams do you want to enter: ");
        int t_Max = sc_int.nextInt(); // Stores the desired amount of teams for later reference

        int t_Num = 0; // Default team number is 0,

        String Teams[] = new String[t_Max]; // The length of the array is set to how many teams was previously input
        int Scores[] = new int[t_Max]; // Same as above but for a separate array

        for(int i = 0; i < t_Max; i++){ // As long as i is less than the array's max length, call for below
            t_Num = t_Num + 1; // Add team number by 1 for each iteration
            System.out.println("Team " + t_Num + ":");
            System.out.print("     Enter team's name: ");
            Teams[i] = sc_string.nextLine(); // Asks for a team name and then stores it in the array
            System.out.print("     Enter team's score (400-1000): ");
            Scores[i] = sc_int.nextInt(); // Asks for a teams score and then stores it in the array

        }
        System.out.println();
        System.out.println();

        for(int i = 0; i < t_Max; i++){
            System.out.println(Teams[i] +"    " + Scores[i]);
        }  // Print both the team name and team score, this will traverse every value in both arrays as a for loop

        System.out.println();
        System.out.println();

        int z = Min_val(Scores);
        int y = Max_val(Scores);
        // The returned address/index number for both Max and Min methods are stored in a variable

        String h_Team = Teams[y] ; // The stored address for the Max value is now called and the actual value in the ...
        // String is now stored as the name of the highest scoring team
        int h_Score = Scores[y];// The stored address for the Max value is now called and the actual value in the ...
        // String is now stored as the Score of the highest scoring team

        String l_Team = Teams[z] ; // Same as above but with min and for the lowest scoring team name
        int l_Score = Scores[z]; // Same as above but with min and for the lowest scoring teams' score


        System.out.print("The " + h_Team + " have the highest score => " + h_Score + " and The " + l_Team + " have the\n" +
                "lowest score => " + l_Score);

        //Prints the previously referenced values


        System.out.println();

        String date = "4/5/22"; //Submission requirement
        String course = "CMIS 141"; //Submission requirement
        System.out.println("\n" + date + " " + course);
        //Submission requirement

    }

}