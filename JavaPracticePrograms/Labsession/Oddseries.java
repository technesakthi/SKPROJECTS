package Labsession;

import java.util.Scanner;

public class Oddseries
{
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){

            System.out.print(k+" ");
            k+=2;

        }
    }
}
