package Labsession;

import java.util.Scanner;

public class dealershiptyres {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int cars[]=new int[n];
        int bikes[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter for Dealership : "+(i+1));
            System.out.println("Enter number of cars: ");
            cars[i]=sk.nextInt();
            System.out.println("Enter number of bikes: ");
            bikes[i]=sk.nextInt();
        }
        int tyres=0,carty=0,bikety=0;
        for(int i=0;i<n;i++){
            carty=cars[i]*4;
            bikety=bikes[i]*2;
            tyres+=carty+bikety;
        }
        System.out.println("Total number of tyres : "+tyres);
    }
}
