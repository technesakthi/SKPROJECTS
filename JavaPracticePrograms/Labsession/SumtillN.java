package Labsession;

import java.util.Scanner;

public class SumtillN {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int sum=0;
        while(n!=0){
            sum+=n;
            n--;
        }
        System.out.println(sum);
    }
}
