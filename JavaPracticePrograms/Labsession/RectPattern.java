package Labsession;

import java.util.Scanner;

public class RectPattern {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        for(int i=0;i<n;i++,System.out.println()){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
        }
    }
}
