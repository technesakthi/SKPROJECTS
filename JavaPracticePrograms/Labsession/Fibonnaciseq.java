package Labsession;

import java.util.Scanner;

public class Fibonnaciseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int f=0,s=1;
        int next=0;
        for (int i=0;i<n;i++){
            System.out.print(f+" ");
            next=f+s;
            f=s;
            s=next;

        }
    }
}
