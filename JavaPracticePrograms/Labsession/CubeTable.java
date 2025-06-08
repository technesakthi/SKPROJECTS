package Labsession;

import java.util.Scanner;

public class CubeTable {
    static int Cube(int n){
        for(int i=1;i<=n;i++){
            System.out.printf("Cube(%d) = "+i*i*i,i);
            System.out.println();
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Cube(n);
    }
}
