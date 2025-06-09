package Labsession;

//  *
//  * A *
//  * B * *
//  * C * * *
//  * D * * * *

import java.util.Scanner;

public class TriawithAlphaPattern {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int num=65;
        int i=1;
        while (i <= n) {
            int j = 1;
            System.out.print("*");
            if (i > 1) {
                System.out.print(" " + (char)num);
                num++;
                j = 1;
            }
            while (j <i) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
