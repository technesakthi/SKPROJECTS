package Labsession;

import java.util.Scanner;

public class Checkfibonnaci {
    static Boolean isFibo(int n){
        int ex1=(5*n*n)+4;
        int ex2=(5*n*n)-4;
        return perfectSquare(ex1)||perfectSquare(ex2);

    }
    static Boolean perfectSquare(int k){
        int sq=(int)Math.sqrt(k);
        return sq*sq==k;
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        if(isFibo(n)){
            System.out.println("Fibonacci Number");
        }
        else System.out.println("Not Fibonacci Number");

    }
}
