package Labsession;

import java.util.Scanner;

public class DigitsSumsingle {
    static int sumUptoSingleDigit (int n){
        while(n>=10){
            int sum=0;
            while(n!=0){
                sum+=n%10;
                n/=10;

            }
            n=sum;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        System.out.println(sumUptoSingleDigit(num));
    }
}
