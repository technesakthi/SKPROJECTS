package JavaPracticePrograms.level2;

import java.util.Scanner;

public class numstarnumpat {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int n = sk.nextInt();
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { 
                for (int j = 0; j < n; j++) {
                    System.out.printf("%02d", num++);
                    if (j < n - 1) System.out.print("*");
                }
            } else {
                int temp = num + n - 1;
                for (int j = 0; j < n; j++) {
                    System.out.printf("%02d", temp--);
                    num++;
                    if (j < n - 1) System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
