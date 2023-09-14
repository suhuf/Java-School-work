/*
Mulai Stewart 3/15/2022

The purpose of this program is to calculate a gamers' exp + exp boost in accordance to their level.

*/

import java.util.Scanner;


class Scratch {
    public static void main(String[] args) {
        while (true) {  // While loop, this is started so that the program can be re-run at will

            Scanner Sc_Str = new Scanner(System.in); // Used to read string inputs later on
            Scanner Sc_Int = new Scanner(System.in); // Same as above but for integers

            System.out.println("Welcome to the Total XP calculation program!");
            System.out.print("Do you want to enter gamer's data? Yes/No => ");
            String Yn = Sc_Str.next(); // Saves input string as "Yn" (meaning Yesno)
            if (Yn.equalsIgnoreCase("yes")) {  // If the string is Yes (upper or lower case continue, if no
                // program ends
            }
            if (Yn.equalsIgnoreCase("no")) {
                break;
            }

            System.out.print("Enter gamer's name => ");
            String Name = Sc_Str.next(); // Saves string input as variable name
            System.out.print("Enter gamer's Level XP scores separated by space: L1 L2 L3 ES => ");
            int L1 = Sc_Int.nextInt();
            int L2 = Sc_Int.nextInt();
            int L3 = Sc_Int.nextInt();
            int ES = Sc_Int.nextInt();
            // The 4 values input earlier are saved as their respective variable

            if (L1 >= 10 & L1 <= 100 & L2 >= 10 & L2 <= 100 & L3 >= 10 & L3 <= 100 & ES >= 10 & ES <= 100)
            { }
            else {
                System.out.println( "All of your values must be less than 100 and greater than 10");
            continue; } // If xp, for all variables, is less than 100 and greater than 10 then program proceeds else
            // Program restarts and demands acceptable values

            System.out.println("Gamer Name: " + Name + " L1=" + L1 + " L2=" + L2 + " L3=" + L3 + " ES=" + ES );

            double Score_1 = L1+L1*0.20+L2+L2*0.30+L3+L3*0.50+ES+ES*0.60;
            int Score_2 = (int)Score_1; // The first variable "Score_1" is used in order to

            System.out.println("Final XP score with bonuses=" + Score_2);
            System.out.print("Do you want to enter another gamer's data? Yes/No => ");

            String Yn_2 = Sc_Str.next(); // Saves new input as Yesno_2

            if (Yn_2.equalsIgnoreCase("yes")) {
                continue;
            } else break; // If String input is yes program restarts (regardless of case) if anything else program ...
            // Ends
        }


// L1+L1*0.20+L2+L2*0.30+L3+L3*0.50+ES+ES*0.60

        String date = "3/15/22"; //Submission requirement
        String course = "CMIS 141"; //Submission requirement
        System.out.println("\n" + date + " " + course);
        //Submission requirement


    }
}