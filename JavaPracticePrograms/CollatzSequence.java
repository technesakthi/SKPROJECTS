import java.util.Scanner;

    public class CollatzSequence {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int k=
            int n = scanner.nextInt();
            while (n != k) {
                System.out.print(n + ", ");
                if (n % 2 == 0) {
                    n = n*2;
                } else {
                    n = 3 * n + 1;
                }
            }
            System.out.println(n); 

        }
    }
    
    

