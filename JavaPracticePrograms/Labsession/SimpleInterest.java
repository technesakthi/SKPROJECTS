package Labsession;

import java.util.Scanner;

public class SimpleInterest {
    static float findSI(float p,float n,float r){
        if (p<0||n<0||r<0) return -1;
        return (p*n*r)/100;
    }
    static float findCI(float p,float n,float r){
        if (p<0||n<0||r<0) return -1;
        double amount=p*Math.pow(1+r/100,n);
        return (float)amount-p;
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        float p=sk.nextFloat();
        float n=sk.nextFloat();
        float r=sk.nextFloat();
        System.out.println(findSI(p,n,r));
        System.out.println();
        System.out.println(findCI(p,n,r));

    }
}
