/*
 * Dice and Roll Program that rolls Dice five times for user using Random,
 * Asks User for High, Low or Equal using Scanner then rolls Dice five times for Computer using Random as well,
 * Then checks if the Guess by User was correct or not
 * This Program uses Scanner, Random, If else and SWITCH statements
 * Bishwash Khakda, Onish Shrestha
 * 09/14/2022
 */

import java.util.*;//for using Random and Scanner
public class HighLowGame {
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int diceLowerLimit = 1;
        int diceUpperLimit = 6;
        String intro_1 = "Welcome to Dice n Roll!!!",
               intro_2 = "You get five Dice rolled, You Choose High, Low or Equal,\nComputer get Five Dice rolled, if you choosed right you win ",
               instruction_1 = "Enter \"H\" if you think your dice total is Higher,", 
               instruction_2 = "and \"L\" if you think your dice total is Lower than ", 
               instruction_3 = "and \"E\" if you think your dice total is gonna be equal to Computer's Dice Total",
               invalidError = "The input was invalid\n",
               winnerMsg = "Great!!! You have won the Game.\n",
               winnerRare = "MINDBLOWING!!! You have won out of the greatest odd.\n",
               loserMsg = "Ops, You lost. Better Luck Next Time\n",
               //String for ASCII Dice art for Extra Credit
               diceThrowArtOne = """
                                 -----
                                 |   |
                                 | o |  1
                                 |   |
                                 -----""",
               diceThrowArtTwo = """
                                 -----
                                 |o  |
                                 |   |  2
                                 |  o|
                                 -----""",
               diceThrowArtThree = """
                                 -----
                                 |o  |
                                 | o |  3
                                 |  o|
                                 -----""",
               diceThrowArtFour = """
                                 -----
                                 |o o|
                                 |   |  4
                                 |o o|
                                 -----""",
               diceThrowArtFive = """
                                 -----
                                 |o o|
                                 | o |  5
                                 |o o|
                                 -----""",
               diceThrowArtSix = """
                                 -----
                                 |o o|
                                 |o o|  6
                                 |o o|
                                 -----""";
        
        //Collection of information to be shown to the user
        Random randGen = new Random();
        System.out.print(intro_1 +  "\n" + intro_2 + "\n");//Prompt to the user
        int userThrowOne = randGen.nextInt(diceLowerLimit, diceUpperLimit + 1);
        int userThrowTwo = randGen.nextInt(diceLowerLimit, diceUpperLimit + 1);
        int userThrowThree = randGen.nextInt(diceLowerLimit, diceUpperLimit + 1);
        int userThrowFour = randGen.nextInt(diceLowerLimit, diceUpperLimit + 1);
        int userThrowFive = randGen.nextInt(diceLowerLimit, diceUpperLimit + 1);
        //Generating Random number for User's Dice Roll for 5 times
        int totalUser = userThrowOne + userThrowTwo + userThrowThree + userThrowFour + userThrowFive;
        //Calculating total of Dice roll for User
        System.out.print("Your Dice roll are: \n");
        switch(userThrowOne){
                case 1 -> System.out.println(diceThrowArtOne);
                case 2 -> System.out.println(diceThrowArtTwo);
                case 3 -> System.out.println(diceThrowArtThree);
                case 4 -> System.out.println(diceThrowArtFour);
                case 5 -> System.out.println(diceThrowArtFive);
                case 6 -> System.out.println(diceThrowArtSix);
        }
        switch(userThrowTwo){
                case 1 -> System.out.println(diceThrowArtOne);
                case 2 -> System.out.println(diceThrowArtTwo);
                case 3 -> System.out.println(diceThrowArtThree);
                case 4 -> System.out.println(diceThrowArtFour);
                case 5 -> System.out.println(diceThrowArtFive);
                case 6 -> System.out.println(diceThrowArtSix);
        }
        switch(userThrowThree){
                case 1 -> System.out.println(diceThrowArtOne);
                case 2 -> System.out.println(diceThrowArtTwo);
                case 3 -> System.out.println(diceThrowArtThree);
                case 4 -> System.out.println(diceThrowArtFour);
                case 5 -> System.out.println(diceThrowArtFive);
                case 6 -> System.out.println(diceThrowArtSix);
        }
        switch(userThrowFour){
                case 1 -> System.out.println(diceThrowArtOne);
                case 2 -> System.out.println(diceThrowArtTwo);
                case 3 -> System.out.println(diceThrowArtThree);
                case 4 -> System.out.println(diceThrowArtFour);
                case 5 -> System.out.println(diceThrowArtFive);
                case 6 -> System.out.println(diceThrowArtSix);
        }
        switch(userThrowFive){
                case 1 -> System.out.println(diceThrowArtOne);
                case 2 -> System.out.println(diceThrowArtTwo);
                case 3 -> System.out.println(diceThrowArtThree);
                case 4 -> System.out.println(diceThrowArtFour);
                case 5 -> System.out.println(diceThrowArtFive);
                case 6 -> System.out.println(diceThrowArtSix);
        }
        //Showing User their Dice roll using ASCII art
        System.out.println("Your Dice total is " + totalUser);//Showing total sum of dice roll of user 
        System.out.println("\n" + instruction_1 + "\n" + instruction_2 + "\n" + instruction_3);
        //Showing instruction for how the game works
        String userPlay = keyboard.next();//Getting user's choice 
        //Testing the input from the user to be within the valid entries
        if (("L".equals(userPlay)) || ("H".equals(userPlay)) || ("E".equals(userPlay))){
            int computerThrowOne = randGen.nextInt(diceLowerLimit, diceUpperLimit + 1);
            int computerThrowTwo = randGen.nextInt(diceLowerLimit, diceUpperLimit + 1);
            int computerThrowThree = randGen.nextInt(diceLowerLimit, diceUpperLimit + 1);
            int computerThrowFour = randGen.nextInt(diceLowerLimit, diceUpperLimit + 1);
            int computerThrowFive = randGen.nextInt(diceLowerLimit, diceUpperLimit + 1);
            //Generating Random number for User's Dice Roll for 5 times
            int totalComputer = computerThrowOne + computerThrowTwo + computerThrowThree + computerThrowFour + computerThrowFive;
            //Calculating total of Dice roll for Computer
            System.out.print("Computer Dice roll are: \n");
            switch(computerThrowOne){
                    case 1 -> System.out.println(diceThrowArtOne);
                    case 2 -> System.out.println(diceThrowArtTwo);
                    case 3 -> System.out.println(diceThrowArtThree);
                    case 4 -> System.out.println(diceThrowArtFour);
                    case 5 -> System.out.println(diceThrowArtFive);
                    case 6 -> System.out.println(diceThrowArtSix);
            }
            switch(computerThrowTwo){
                    case 1 -> System.out.println(diceThrowArtOne);
                    case 2 -> System.out.println(diceThrowArtTwo);
                    case 3 -> System.out.println(diceThrowArtThree);
                    case 4 -> System.out.println(diceThrowArtFour);
                    case 5 -> System.out.println(diceThrowArtFive);
                    case 6 -> System.out.println(diceThrowArtSix);
            }
            switch(computerThrowThree){
                    case 1 -> System.out.println(diceThrowArtOne);
                    case 2 -> System.out.println(diceThrowArtTwo);
                    case 3 -> System.out.println(diceThrowArtThree);
                    case 4 -> System.out.println(diceThrowArtFour);
                    case 5 -> System.out.println(diceThrowArtFive);
                    case 6 -> System.out.println(diceThrowArtSix);
            }
            switch(computerThrowFour){
                    case 1 -> System.out.println(diceThrowArtOne);
                    case 2 -> System.out.println(diceThrowArtTwo);
                    case 3 -> System.out.println(diceThrowArtThree);
                    case 4 -> System.out.println(diceThrowArtFour);
                    case 5 -> System.out.println(diceThrowArtFive);
                    case 6 -> System.out.println(diceThrowArtSix);
            }
            switch(computerThrowFive){
                    case 1 -> System.out.println(diceThrowArtOne);
                    case 2 -> System.out.println(diceThrowArtTwo);
                    case 3 -> System.out.println(diceThrowArtThree);
                    case 4 -> System.out.println(diceThrowArtFour);
                    case 5 -> System.out.println(diceThrowArtFive);
                    case 6 -> System.out.println(diceThrowArtSix);
            }
            //Showing User Computer's Dice roll using ASCII art
            System.out.println("Computer Dice total is " + totalComputer);
            //If else statement for testing if user choice was correct or not when they enter "H"
            if ("H".equals(userPlay )){
                if (totalUser > totalComputer){
                    System.out.print(winnerMsg);
                }
                else{
                    System.out.print(loserMsg);
                }}
            //If else statement for testing if user choice was correct or not when they enter "L"
            else if ("L".equals(userPlay )){
                if (totalUser < totalComputer){
                    System.out.print(winnerMsg);
                }
                else{
                    System.out.print(loserMsg);
                    }}
            //If else statement for testing if user choice was correct or not when they enter "E"
            else if ("E".equals(userPlay )){
                if (totalUser == totalComputer){
                    System.out.print(winnerRare);
                }
                else{
                    System.out.print(loserMsg);
                    }}
            }
        //Show error message for invalid entries from the User
        else {
            System.out.print(invalidError);
        }
    }
}
