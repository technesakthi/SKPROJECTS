package Labsession;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int step=sc.nextInt();
        for(int i=start;i<end;i+=step){
            System.out.print(i+" ");
        }
    }
}
