package JavaPracticePrograms.level2;

import java.util.Scanner;

public class swapdigitpos {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos1 = sc.nextInt();
        int pos2 = sc.nextInt();
        sc.close();

        int temp = num, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int pos1Val = 0, pos2Val = 0, pos = 1, numn = 0, mul = 1;
        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            if (pos == pos1) {
                pos1Val = digit;
            } else if (pos == pos2) {
                pos2Val = digit;
            }
            temp /= 10;
            pos++;
        }

        temp = num;
        pos = 1;

        while (temp > 0) {
            int digit = temp % 10;
            if (pos == pos1) {
                numn = numn + pos2Val * mul;
            } else if (pos == pos2) {
                numn = numn + pos1Val * mul;
            } else {
                numn = numn + digit * mul;
            }
            temp /= 10;
            mul *= 10;
            pos++;
        }

        System.out.println(numn);
    }
}

