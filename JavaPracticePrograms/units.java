import java.util.*;
public class units {
        public static void main(String[] args) {
            Scanner sk = new Scanner(System.in);
            int units = sk.nextInt();
            
            double bill = 0;
            
            if (units <= 50) {
                bill = units * 0.50;
            } 
            else if (units <= 150) {
                bill = (50 * 0.50) + ((units - 50) * 0.75);
            } 
            else if (units <= 250) {
                bill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
            } 
            else {
                bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
            }
            
            double totalBil = bill + (0.20 * bill);
            System.out.println(totalBil);
            
            
        }
    }
    

    
