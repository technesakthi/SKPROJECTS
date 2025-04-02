package JavaPracticePrograms.level2;
import java.util.*;
public class leftdigitdivisibility {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        long num = sk.nextLong(); 
        long temp = num; 
        while (temp >= 10) {
            temp /= 10;
        }
        long left = temp; 
        if (left!= 0 && num % left == 0) {
            System.out.println(left);
        } else {
            System.out.println(-1);
        }
    }
}

