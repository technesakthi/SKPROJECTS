package Labsession;

import java.util.Scanner;

public class ASCIIValue {
    static void printASCII(char data[]){
        System.out.println("------------------------------------");
        System.out.println("Char                     ASCII Value");
        System.out.println("------------------------------------");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+"                           "+(int)data[i]);
            System.out.println();
        }
        System.out.println("------------------------------------");



    }



    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int n=sk.nextInt();
        char []in=new char[n];
        for(int i=0;i<n;i++){
            in[i]=sk.next().charAt(0);
        }
        printASCII(in);

    }
}
