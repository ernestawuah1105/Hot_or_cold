import javax.print.DocFlavor;
import java.util.Random;
import java.util.Scanner;

/**
 * Hot or cold Game
 * @author Ernest A.
 *
 */

public class HotCold {
    public static void main(String[] args) {
        String yesOrNo;
        //generate random number//
        do {
            int rand = new Random().nextInt(1001);
            System.out.println(rand);
            Scanner in = new Scanner(System.in);
            int guess;
            do {

                //Tell user to guess a number
                System.out.println("Guess a number from 0 to a 1000");
                guess = in.nextInt();

                //Display whether guess is hotter or colder
                //TODO HOTCOLDLOGIC
                System.out.println("Your Guess Is Cold");
            } while (guess != rand);
            System.out.println("Do you want play again. YES or NO");
            in.nextLine();
            yesOrNo = in.nextLine();
        } while(yesOrNo.equalsIgnoreCase("YES"));



    }

}
