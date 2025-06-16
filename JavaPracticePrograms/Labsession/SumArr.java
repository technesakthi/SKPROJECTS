package Labsession;

import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int arr[]=new int[n];
        for(int a=0;a<n;a++){
            arr[a]=sk.nextInt();
        }
        System.out.print("Sum :"+ findSum(arr,n));
    }
    static int findSum(int a[],int m){
        int sum=0;
        for(int i=0;i<m;i++) sum+=a[i];
        return sum;
    }
}
