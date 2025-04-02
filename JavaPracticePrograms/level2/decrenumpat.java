package JavaPracticePrograms.level2;

import java.util.Scanner;

public class decrenumpat {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n = sk.nextInt(); 
        int m = sk.nextInt(); 

        for (int i = 0; i < m; i++,System.out.println()) {
            System.out.print(n); // 

            for (int j = 1; j < n - 1; j++) { 
                System.out.print(i + 1); 
            }

            System.out.print(n); 
            
        }

    }
    
}
