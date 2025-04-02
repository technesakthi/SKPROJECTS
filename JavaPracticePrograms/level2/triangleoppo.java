package JavaPracticePrograms.level2;
import java.util.*;
public class triangleoppo {
    public static void main(String[] args) {
        Scanner sk= new Scanner(System.in);
        int n = sk.nextInt();
        int num = 1; 
        for (int i = 1; i <= n; i++,System.out.println()) {
            int start = num;
            int end = num + i - 1;
            num = end + 1; 
            if (i % 2 == 0) { 
                for (int j = start; j <= end; j++) {
                    System.out.print(j + " ");
                }
            } else { 
                for (int j = end; j >= start; j--) {
                    System.out.print(j + " ");
                }
            }
    }
}
}
