package Labsession;

import java.util.Scanner;

public class SquareTable {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        for(int i=1;i<=n;i++){
            System.out.printf("Square(%d) = "+(i*i),i);
            System.out.println();
        }
    }
}
