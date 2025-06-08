package Labsession;

import java.util.Scanner;

public class Oddevencheck {
    static String isEvenorOdd(int n){
        return (n%2)==0?n+" is Even No.":n+" is Odd.";
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        System.out.println(isEvenorOdd(num));

    }
}
