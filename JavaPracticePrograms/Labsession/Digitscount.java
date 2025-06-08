package Labsession;

import java.util.Scanner;

public class Digitscount {
    static int countNumberOfDigits (int num){
        int c=0;
        while(num!=0){
            num/=10;
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        System.out.println(countNumberOfDigits(n));
    }
}
