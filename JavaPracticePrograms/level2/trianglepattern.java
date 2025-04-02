package JavaPracticePrograms.level2;

import java.util.Scanner;

public class trianglepattern {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int n = sk.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++,System.out.println()) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
        }

    }
    
}
