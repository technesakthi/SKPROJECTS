package Labsession;

import java.util.Scanner;

public class PrimeRangeCount {
    static Boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int start=sk.nextInt();
        int end=sk.nextInt();
        int c=0;
        while(start<end){
            if(isPrime(start)) {
                System.out.print(start+" ");
                c++;

            }
            start++;
        }
        System.out.println();
        System.out.println(c);
    }
}
