
import java.util.Random;
import java.util.Scanner;

/**
 * Write a description of class computervs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class playersvs
{
    private boolean won;
    playersvs(){
        won = false;

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

    public void SetWinner(){
        won = true;
    }
}
