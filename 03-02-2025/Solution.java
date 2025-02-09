
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Read two inputs
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            // Try dividing a by b and print the result
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Handle invalid input
            System.out.println("java.util.InputMismatchException");
        }
        scanner.close();
    }
}
