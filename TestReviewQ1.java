

package testreviewq1;
import java.util.Scanner;

public class TestReviewQ1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        
        double CELSIUS = input.nextInt();
        
        double FAHRENHEIT = (9.0/ 5.0) * CELSIUS +32;
        
        System.out.println(FAHRENHEIT);
        
    }
}
