package JavaPracticePrograms.level2;

import java.util.Scanner;

public class repeatingpattern {
    public static void main(String[] args) {
         Scanner sk= new Scanner(System.in);
        int n = sk.nextInt(); 
        int size = 2 * n - 1; 

        for (int i = 0; i < size; i++, System.out.println()) {
            int num = n;
            int index = i < n ? i : size - i - 1; 
            for (int j = 0; j < index; j++) {
                System.out.print(num--);
            }
            for (int j = 0; j < size - 2 * index; j++) {
                System.out.print(num);
            }
            for (int j = 0; j < index; j++) {
                System.out.print(++num);
            }
           
    }
    
}
}
