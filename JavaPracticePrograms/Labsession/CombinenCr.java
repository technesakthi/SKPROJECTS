package Labsession;

import java.util.Scanner;

public class CombinenCr {
    static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);

    }
    static int nCr(int n,int r){
        if(n<r) return 0;
        return fact(n)/(fact(r)*fact(n-r));
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int r=sk.nextInt();
        System.out.println(nCr(n,r));
    }
}
