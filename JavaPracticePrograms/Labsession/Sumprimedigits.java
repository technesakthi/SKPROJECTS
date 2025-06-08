package Labsession;

import java.util.Scanner;

public class Sumprimedigits {
    static int digits(int n){
        int y=0,sum=0;
        while(n!=0){
            y=n%10;
            if(y==2||y==3||y==5||y==7) sum+=y;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        System.out.println(digits(num));
    }
}
