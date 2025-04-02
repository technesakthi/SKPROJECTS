package JavaPracticePrograms.level2;
import java.util.*;
public class shiftnumpat {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int n = sk.nextInt(); 
        for (int i = 0; i < n; i++,System.out.println()) {
            for (int j = 0; j < n; j++) { 
                int num = i + j + 1;
                if (num > n) { 
                    num -= n;
                }
                System.out.print(num);
            }
        }
    }
    
}
