//Zach Johnston
//CS 145
// Tik Tac Toe
// Create a game that can play tik tac toe with 2 Players
// It will start by telling the players the rules
// Then print the Gameboard
// After that it will continue to ask the user for moves until there is a winner
// After 3 of the same letter is in a row it will print winner
// Otherwise if no spaces are left it will print draw
import java.util.*;
 
public class TikTakToe {
   
   
   //Create a Arrays to store the Gameboard
    static String[] Gameboard;
  // Keeps track of the Players turn
    static String Playerturn;
   
   
  // Checks the wincon for each Gameboard
    static String checkWinCon()
    {
        for (int i = 0; i < 8; i++) {
            String row = null;
 
            switch (i) {
            case 0:
                row = Gameboard[0] + Gameboard[1] + Gameboard[2];
                break;
            case 1:
                row = Gameboard[3] + Gameboard[4] + Gameboard[5];
                break;
            case 2:
                row = Gameboard[6] + Gameboard[7] + Gameboard[8];
                break;
            case 3:
                row = Gameboard[0] + Gameboard[3] + Gameboard[6];
                break;
            case 4:
                row = Gameboard[1] + Gameboard[4] + Gameboard[7];
                break;
            case 5:
                row = Gameboard[2] + Gameboard[5] + Gameboard[8];
                break;
            case 6:
                row = Gameboard[0] + Gameboard[4] + Gameboard[8];
                break;
            case 7:
                row = Gameboard[2] + Gameboard[4] + Gameboard[6];
                break;
            }
            //used to see X winner
            if (row.equals("XXX")) {
                return "X";
            }
             
            //used to see O winner
            else if (row.equals("OOO")) {
                return "O";
            }
        }
         
        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(Gameboard).contains(String.valueOf(i + 1))) {
                break;
            }
            //checks for draw
            else if (i == 8) {
                return "draw";
            }
        }
 
      //If they place on the same spot
        System.out.println(
            Playerturn + "'s turn; Enter the number to put "+ Playerturn + " in:");
        return null;
    }
     
    // To print out the board.
    static void printGameBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + Gameboard[0] + " | "
                           + Gameboard[1] + " | " + Gameboard[2]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + Gameboard[3] + " | "
                           + Gameboard[4] + " | " + Gameboard[5]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + Gameboard[6] + " | "
                           + Gameboard[7] + " | " + Gameboard[8]
                           + " |");
        System.out.println("|---|---|---|");
    }
 
    public static void main(String[] args)
    {
        //Input 
        Scanner scan = new Scanner(System.in);
        //Create new Gameboard
        Gameboard = new String[9];
        //Makes Playerturn = X
        Playerturn = "X";
        //Winner is set to null
        String Playerwin = null;
 
        for (int i = 0; i < 9; i++) {
            Gameboard[i] = String.valueOf(i + 1);
        }
        //Prints the rules
        System.out.println("Welcome to Tic Tac Toe!");
         System.out.println("Each turn you will choose a space  to play an X or O");
          System.out.println("The Goal is to get 3 of the same letter in a row");
           System.out.println("Remember you can block the other players moves");
        //Print the Gameboard
        printGameBoard();
 
        System.out.println(
            //Tells the player to make a move
            "X will play first. Enter a number to put X in:");
        //When no has won
        while (Playerwin == null) {
            int UserInput;
           
           //Need an Input that is 1-9
           //Otherwise it will continue to ask for input
            try {
                UserInput = scan.nextInt();
                if (!(UserInput > 0 && UserInput <= 9)) {
                    System.out.println(
                        "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                    "Invalid input; re-enter slot number:");
                continue;
            }
             
          //Check which player turn it is
            if (Gameboard[UserInput - 1].equals(String.valueOf(UserInput))) {
                
                Gameboard[UserInput - 1] = Playerturn;
 
                if (Playerturn.equals("X")) {
                    Playerturn = "O";
                }
                else {
                    Playerturn = "X";
                }
 
                printGameBoard();
                Playerwin = checkWinCon();
            }
            else {
                //Already taken space
                System.out.println(
                    "Space already taken; re-enter slot number:");
            }
        }
       
       //If no one wins then it is a draw
        if (Playerwin.equalsIgnoreCase("draw")) {
            System.out.println(
                "It was a draw! Thank you for playing.");
        }
       
       //When someone wins
        else {
            System.out.println(
                "Congratulations! " + Playerwin
                + " won! Thank you for playing.");
        }
    //Close the input and ends the program
      scan.close();
    }
}