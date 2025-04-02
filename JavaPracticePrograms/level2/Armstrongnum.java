package JavaPracticePrograms.level2;

import java.util.Scanner;

public class Armstrongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num = num1;
        while (num <= num2) {
            int sum = 0, temp = num, digits = 0;
            int temp2 = num;
            
            while (temp2 > 0) {
                digits++;
                temp2 /= 10;
            }
            
            temp2 = num;
            while (temp2 > 0) {
                int digit = temp2 % 10;
                int power = 1, i = 0;
                while (i < digits) {
                    power *= digit;
                    i++;
                }
                sum += power;
                temp2 /= 10;
            }
            
            if (sum == num) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
