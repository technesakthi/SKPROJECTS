package JavaPracticePrograms.level2;
import java.util.*;
public class inversetrianglepat {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n = sk.nextInt();
        int st = 1;
        int end = n * (n + 1);
        for (int i = 0; i < n; i++,System.out.println()) {
            int spaces = i * 3; 
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.printf("%02d ", st++);
            }
            for (int j = 0; j < n - i; j++) {
                if (end >= st) {
                    System.out.printf("%02d ", end--);
                }
            }
        }
    }
    
}
