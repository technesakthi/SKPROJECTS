package Labsession;

import java.util.Scanner;

public class MultipleOfTwentyseven {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        if(num%27==0){
            System.out.println(num+" is a multiple of 27");
        }
        else System.out.println(num+" is not a multiple of 27");
    }
}
