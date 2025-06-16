package Labsession;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        do{
            System.out.println("Welcome to do-while ");
            n--;
        }while(n>0);
    }
}
