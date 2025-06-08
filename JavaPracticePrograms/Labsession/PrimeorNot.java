package Labsession;

import java.util.Scanner;

public class PrimeorNot {
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
        int num=sk.nextInt();
        if(isPrime(num)) System.out.println(num+" is a prime number");
        else System.out.println(num+" is not a prime number");
    }
}
