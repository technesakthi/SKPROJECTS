package Labsession;

import java.util.Scanner;

public class FibonacciNth {
    static int fibonacci(int k){
        if(k==0) return 0;
        if(k==1) return 1;
        return fibonacci(k-1)+fibonacci(k-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
