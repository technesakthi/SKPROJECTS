package Labsession;

import java.util.Scanner;

public class AmstrongNum {
    static int cube(int n){
        return n*n*n;
    }
    static Boolean isArm(int n){
        int sum=0;
        int temp=n;
        while(temp!=0){
            sum+=cube(temp%10);
            temp/=10;
        }
        return sum==n;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isArm(num)?num+" is a Armstrong Number":num+" is not a Armstrong Number");
    }
}
