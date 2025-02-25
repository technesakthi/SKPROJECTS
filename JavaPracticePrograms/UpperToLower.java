import java.util.*;

    public class UpperToLower {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            
            if (ch >= 'A' && ch <= 'Z') {

                char lowercase = (char) (ch + 32);
                System.out.println (lowercase);
            }
            else if (ch >= '0' && ch <= '9') {
                System.out.println(" number");
            }

            else {
                System.out.println("special character");
            }
            
        }
    }
    
    
