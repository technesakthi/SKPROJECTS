import java.util.*;
public class checkvaliddate {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        String date = sk.nextLine();
        String arr[] = new String[3];
        arr = date.split("/");
        
        int dd = Integer.parseInt(arr[0]);
        int mm = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);

        if (y >= 1900 && y <= 9999) {
            if (mm >= 1 && mm <= 12) {
                if ((dd >= 1 && dd <= 31) && (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12)) {
                    System.out.println("Valid");
                }
                else if ((dd >= 1 && dd <= 30) && (mm == 4 || mm == 6 || mm == 9 || mm == 11)) {
                    System.out.println("Valid");
                }
                else if ((dd == 28) && (mm == 2)) {
                    System.out.println("Valid");
                }
                else if ((dd == 29) && (mm == 2) && ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))) {
                    System.out.println("Valid");
                }
                else {
                    System.out.println("Not valid");
                }
            } 
            else {
                System.out.println("Not valid");
            }
        } 
        else {
            System.out.println("Not valid");
        }
        
    }
}
