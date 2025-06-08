package Labsession;

import java.util.Scanner;

public class DigitsSum {
    static int sumOfDigits (int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        System.out.println(sumOfDigits(num));
    }
}
