import java.util.Scanner;

    public class CollatzSequence {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Get user input
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            
            // Print the Collatz sequence
            System.out.print("Sequence: ");
            while (n != 1) {
                System.out.print(n + ", ");
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
            }
            System.out.println(n); 
            
            scanner.close();
        }
    }
    
    

