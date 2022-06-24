/*
The system must ask the user for an integer between 0 and 10.
The system must generate a random number between 0 and 10.
If the user's number is greater than the system's generated number, then the user wins.
Otherwise, the system wins.

The system must inform the user who won.
The system must display an error message if the user's input is not in the desired range.
The system must display an error message if the user's input is not a number.

Let the user choose game "level" - tell the user what each level means:
Easy: guess a number 
 program will tell you if it was higher or equal (you win) or lower (computer wins) than the program's number.

Medium: guess a number 
 program will tell you if it was strictly higher (you win) or lower or equal (computer wins) than the program's number.

Hard: guess a number 
 program will tell you if it was equal (you win) or not (you lose) to the program's number.

Store each game level “explanation message” in an array and use the level indicated by the user to index into the array.
*/

import java.util.Scanner;
import java.util.Random;

public class StudentGame {

    public static void main(String[] args) {

        // prints out the description of difficulty levels and their respective description
        String[] difficulty = {"1. Easy Difficulty: program will tell you if it was higher or equal (you win) or lower (computer wins) than the program's number.", 
        "2. Medium Difficulty: program will tell you if it was strictly higher (you win) or lower or equal (computer wins) than the program's number.", 
        "3. Hard Difficulty: program will tell you if it was equal (you win) or not (you lose) to the program's number."};
        System.out.println("Choose a difficulty by entering a valid number (1,2 or 3):");
        for (String s : difficulty)
            System.out.println(s);

        // lets user select which difficult mode in which he/she wants to play
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int level = scn.nextInt();
            if (level == 1) {
                easyMode();
            } else if (level == 2) {
                mediumMode();
            } else if (level == 3) {
                hardMode();
            } else {
                System.err.println("ERROR: Enter the valid difficulty level.");
                System.exit(1);
            }
        } else {
            System.err.println("ERROR: Enter the valid value.");
            System.exit(1);
        }

    }

    // helper method: return a system-generated random number
    public static int generateRandomNumber() {
        Random rand = new Random();
        int n = rand.nextInt(11);
        return n;
    }

    // Easy: program will tell you if it was higher or equal (you win) 
    // or lower (computer wins) than the program's number.
    public static void easyMode() {

        System.out.println("========== You are playing an easy mode ==========");

        int systemRandomNumber = generateRandomNumber();
        System.out.println("System has generated the random number between 0 and 10.");

        Scanner in = new Scanner(System.in);
        System.out.print("Now it is your turn. Please enter a number between 0 and 10: ");


        if (!in.hasNextInt()) {
            System.err.println("ERROR: You did not enter the integer value. Please try again.");
            System.exit(1);
        }
        
        int userRandomNumber = in.nextInt();

        if (userRandomNumber >= 0 && userRandomNumber <= 10) {
            ;
        } else {
            System.err.println("ERROR: You did not enter the number between 0 and 10. Please try again.");
            System.exit(1);
        }

        if (systemRandomNumber > userRandomNumber) {
            System.out.println("System generated " + systemRandomNumber + " and you entered " + userRandomNumber + ".");
            System.out.println("Since the system has the higher number than your number, SYSTEM WON this time.");
        } else {
            System.out.println("System generated " + systemRandomNumber + " and you entered " + userRandomNumber + ".");
            System.out.println("Since you have the number that is higher than or equal to number generated by the system, YOU WON this time.");
        }

    }


    //Medium: program will tell you if it was strictly higher (you win) 
    // or lower or equal (computer wins) than the program's number.
    public static void mediumMode() {

        System.out.println("========== You are playing a medium mode ==========");

        int systemRandomNumber = generateRandomNumber();
        System.out.println("System has generated the random number between 0 and 10.");

        Scanner in = new Scanner(System.in);
        System.out.print("Now it is your turn. Please enter a number between 0 and 10: ");


        if (!in.hasNextInt()) {
            System.err.println("ERROR: You did not enter the integer value. Please try again.");
            System.exit(1);
        }
        
        int userRandomNumber = in.nextInt();

        if (userRandomNumber >= 0 && userRandomNumber < 10) {
            ;
        } else {
            System.err.println("ERROR: You did not enter the number between 0 and 10. Please try again.");
            System.exit(1);
        }

        if (systemRandomNumber >= userRandomNumber) {
            System.out.println("System generated " + systemRandomNumber + " and you entered " + userRandomNumber + ".");
            System.out.println("Since the system has the number that is higher than or equal to your number, SYSTEM WON this time.");
        } else {
            System.out.println("System generated " + systemRandomNumber + " and you entered " + userRandomNumber + ".");
            System.out.println("Since you have the number that is strictly higher than the number generated by the system, YOU WON this time.");
        }

    }


    // Hard: program will tell you if it was equal (you win) or not (you lose) 
    // to the program's number.
    public static void hardMode() {

        System.out.println("========== You are playing a hard mode ==========");

        int systemRandomNumber = generateRandomNumber();
        System.out.println("System has generated the random number between 0 and 10.");

        Scanner in = new Scanner(System.in);
        System.out.print("Now it is your turn. Please enter a number between 0 and 10: ");


        if (!in.hasNextInt()) {
            System.err.println("ERROR: You did not enter the integer value. Please try again.");
            System.exit(1);
        }
        
        int userRandomNumber = in.nextInt();

        if (userRandomNumber >= 0 && userRandomNumber < 10) {
            ;
        } else {
            System.err.println("ERROR: You did not enter the number between 0 and 10. Please try again.");
            System.exit(1);
        }

        if (systemRandomNumber == userRandomNumber) {
            System.out.println("System generated " + systemRandomNumber + " and you entered " + userRandomNumber + ".");
            System.out.println("The system has the same number than your number, YOU WON this time.");
        } else {
            System.out.println("System generated " + systemRandomNumber + " and you entered " + userRandomNumber + ".");
            System.out.println("You have the number that is different than the number generated by the system, SYSTEM WON this time.");
        }

    }


}