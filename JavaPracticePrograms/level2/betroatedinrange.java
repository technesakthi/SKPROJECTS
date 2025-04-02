package JavaPracticePrograms.level2;
import java.util.*;
public class betroatedinrange {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int start = sk.nextInt();
        int end = sk.nextInt();
        for (int a = start; a <= end; a++) {
            int sumA = 1;
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    sumA += i;
                    if (i != a / i) {
                        sumA += a / i;
                    }
                }
            }
            int b = sumA - 1;

            if (b > a && b <= end) {
                int sumB = 1;
                for (int i = 2; i * i <= b; i++) {
                    if (b % i == 0) {
                        sumB += i;
                        if (i != b / i) {
                            sumB += b / i;
                        }
                    }
                }
                if (sumB - 1 == a) {
                    System.out.println(a + "," + b);
                }
            }
        }
    }
    
}
