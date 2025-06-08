package Labsession;

import java.util.Scanner;

public class MultipleorNot {
    static boolean isMulofX(int n,int x){
        return n%x==0;
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int x=sk.nextInt();
        if(isMulofX(n,x)) System.out.println(n+" is a multiple of "+ x);
        else System.out.println(n+" is not a multiple of "+ x);
    }
}
