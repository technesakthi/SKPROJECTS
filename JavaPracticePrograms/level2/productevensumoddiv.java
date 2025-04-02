package JavaPracticePrograms.level2;

import java.util.Scanner;

public class productevensumoddiv {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int num = sk.nextInt();
        int pos= 1, sumOdd = 0, prodEven = 1;
        while (num > 0) {
            int digit = num % 10;
            if (pos% 2 !=0 ) {
                sumOdd += digit;
            } else {
                prodEven *= digit;
            }
            num /= 10;
            pos++;
        }
        
        if (prodEven % sumOdd == 0) {
            System.out.println("YEs");
        } else {
            System.out.println("NO");
        }
    }
}
