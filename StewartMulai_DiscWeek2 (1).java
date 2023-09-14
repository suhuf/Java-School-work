
import java.util.Scanner;      //Used to read inputs

class Scratch {
    public static void main(String[] args) {

        Scanner ourVal = new Scanner(System.in);

        System.out.println("This is a program to calculate the mean of 5 numbers **This program only accepts Integers " +
                "and Floats** ");

        // Prints a string that does not accept input but informs user of programs ...
        // ... purpose

        System.out.println("Input your first number");
        // Prompt for input

        float val1 = ourVal.nextFloat();

        // This is the actual function that accepts the input and stores it as value 1

        System.out.println("Your first number is " + val1);

        // Notifies user of what has been stored as an input

        System.out.println("Input your second number");

        // This is the same as previously accept for another value, the following lines act to the same effect.
        float val2 = ourVal.nextFloat();

        System.out.println("Your second number is " + val2);

        System.out.println("Input your third number");

        float val3 = ourVal.nextFloat();

        System.out.println("Your third number is " + val3);

        System.out.println("Input your fourth number");

        float val4 = ourVal.nextFloat();

        System.out.println("Your fourth number is " + val4);

        System.out.println("Input your fifth number");

        float val5 = ourVal.nextFloat();

        System.out.println("Your fifth number is " + val5);

        float mean = (val1 + val2 + val3 + val4 + val5)/5;

        System.out.println("The mean of your values " + mean);

        System.out.println("Your mean as a Hexdecimal string is");

        // Pre-emptive string for the hexadecimal string conversion

        String hexmean = Float.toHexString(mean);

        // Converts the mean to a hexadecimal string

        System.out.println(hexmean);

        // Prints the Hex string
        String date = "2/27/22"; //Submission requirement
        String course = "CMIS 141"; //Submission requirement
        System.out.println("\n" + date + " " + course);
        //Submission requirement
    }
}