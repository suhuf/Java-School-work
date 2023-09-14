/*
Program takes in user input and then creates a pattern
*/

import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
Scanner Sc_int1 = new Scanner(System.in);  //Calls function to accept user input later on
Scanner Sc_int2 = new Scanner(System.in);

        System.out.print("Enter in which number you would like the program to start with. ");

int a = Sc_int1.nextInt(); // Saves user input as a for future reference

int max = a + 7 ; //This is to make sure no matter what number is chosen by the user, that 7 iterations...
        //... are made through this variable being the maximum

for ( int i = 1; i < max; i++) {   // Everytime i is less than user input + 7 the program is rerun and i increases by 1
    for (int j = a ; j <= i; j++) { // Everytime the first program passes the second one does and prints J which starts
        //.. as user input and then increases steadily,

        System.out.printf("%4d", j); // Prints J with spaces for readability and the pattern-shape
           }
    System.out.println();
        }
System.out.println();


// ****Second part of assignment*****
        System.out.print("Enter the value of n: ");

        int b = Sc_int2.nextInt(); // Saves user input as b for future reference

        int max2 = b - 9; //This is to make sure no matter what number is chosen by the user, that 9 iterations...
        //... are made through this variable being the maximum


    for (int i = 1; i <= 9; i++){
        for(int j = b, c = 0 ; j > max2; j--, c++) {
            int n = j;
            if(c == 8) {n = b;}
            if( i == 1 ) {n = b;}
            if( i == 9 ) {n = b;}

            // If the number of iterations is at a certain threshold the value...
            // returns to its default with the if statements


            System.out.printf("%4d", n); // Prints n with spaces for readability and the pattern-shape
        }
        System.out.println();
    }

        String date = "3/22/22"; //Submission requirement
        String course = "CMIS 141"; //Submission requirement
        System.out.println("\n" + date + " " + course);
        //Submission requirement
    
    }
}