import java.util.Scanner;
/**
 * Write a description of class tictactoe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tictactoe
{
    // instance variables - replace the example below with your own

    public static void main(String[] args) {
        int count = 1;
        boolean wins = false;
        String[] spots = new String [9];
        String marker = "X";
        //if count is odd its player one and if count is even its player 2
        playersvs player = new playersvs();
        for (int i = 0; i< spots.length; i++){
            spots[i] = Integer.toString(i + 1);
        }
        int turn = 0;
        printBoard(spots);
        while (turn < 9 && !wins){
            System.out.println("Turn number: " + turn);
            if (turn >= 1){
                marker = decidePlayer(marker);

            }
            int spot = promptPlayer(spots, marker);
            spots[spot-1] = marker;
            wins = didtheyWin(spots);
            printBoard(spots);
            turn++;
        }
        if (wins){
            player.SetWinner();
            if(count%2==0){
                System.out.println("Player 2 gets the chicken dinner!");
            }else{
                System.out.println("Player 1 gets the chicken dinner!");
            }
        }
        else{
            System.out.println("This is not epic, its a draw");
        }
        

    }

    public static boolean didtheyWin(String[] s){
        if (s[0].equals(s[1]) && s[0].equals(s[2])){
            return true;

        }else if (s[3].equals(s[4]) && s[3].equals(s[5])){
            return true;
        }else if (s[2].equals (s[5]) && s[2].equals(s[8])){
            return true;
        }else if (s[1].equals (s[4]) && s[1].equals(s[7])){
            return true;

        }else if (s[0].equals (s[3]) && s[0].equals(s[6])){
            return true;
        }else if (s[2].equals (s[4]) && s[2].equals(s[6])){
            return true;

        }else if (s[0].equals (s[4]) && s[0].equals(s[8])){
            return true;
        }else if (s[6].equals (s[7]) && s[6].equals(s[8])){
            return true;
        }else {
            return false;
        }
    }

    public static String decidePlayer(String lastPlayer){
        if (lastPlayer == "X") {
            return "O";
        }else {
            return "X";
        }

    }
    
    public static int promptPlayer(String[] s, String marker){
        //change this
        Scanner scnr = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter number of space to place your spot: ");
            int spot = scnr.nextInt();
            scnr.nextLine();
            if (s[spot-1].equals(Integer.toString(spot))){
                return spot;
            } else {
                System.out.println("Sorry wrong move, maybe try again?");
            }
            //this may need to be indented
            scnr.close();    
        }

    }

    public static void printBoard(String[] s) {
        System.out.println("GOOD LUCK :-}");        
        System.out.println("_____________");
        System.out.println("    |   |    ");
        System.out.println("  " + s[0] + " | " + s[1] + " | " + s [2]  + " ");
        System.out.println("    |   |    ");
        System.out.println("****+***+*****");
        System.out.println("  " + s[3] + " | " + s[4] + " | " + s [5]  + " ");
        System.out.println("    |   |    ");
        System.out.println("****+***+*****");
        System.out.println("  " + s[6] + " | "  + s[7] + " | " + s [8]  + " ");
        System.out.println("    |   |    ");
        System.out.println("_____________");

    }
    //have a player as a class
    //main woudl be in charge of creating two players
}

