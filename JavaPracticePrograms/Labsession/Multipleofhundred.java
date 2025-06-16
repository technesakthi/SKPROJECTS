package Labsession;

import java.util.Scanner;

public class Multipleofhundred {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        if(num%100==0){
            System.out.println(num+" is a multiple of 100");
        }
        else System.out.println(num+" is not a multiple of 100");
    }
}
