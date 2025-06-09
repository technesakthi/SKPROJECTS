package Labsession;

import java.util.Scanner;
//*
//* *
//* * *

public class TriangPattern {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        for(int i=0;i<n;i++,System.out.println()){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
        }
    }
}
