package Labsession;

import java.util.Scanner;

public class StrongNumber {
    static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);

    }
    static Boolean isStrong(int n){
        int sum=0;
        int temp=n;
        while(temp!=0){
            sum+=fact(temp%10);
            temp/=10;
        }
        return sum==n;


    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        if(isStrong(n)){
            System.out.println(n+" is a Strong Number");
        }
        else  System.out.println(n+" is not a Strong Number");

    }
}
