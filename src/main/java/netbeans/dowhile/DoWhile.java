
package netbeans.dowhile;
import java.util.Scanner;

/**
 *
 * @author halfrikan
 */
public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int userNumber;
        String userNumberString;
        
        do {
            System.out.println("pick a number between 1 and 20");
            userNumberString = sc.nextLine();
            userNumber = Integer.parseInt(userNumberString);
            
        } while ( userNumber <1 || userNumber > 20);
        
        System.out.println("thank you!! your number is: " + userNumber);
        
    }
}
