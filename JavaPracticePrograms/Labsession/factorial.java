package Labsession;

import java.util.Scanner;

public class factorial {
    static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);

    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        System.out.println(fact(num));
    }
}
