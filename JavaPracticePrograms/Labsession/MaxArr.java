package Labsession;

import java.util.Scanner;

public class MaxArr {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int arr[]=new int[n];
        for(int j=0;j<n;arr[j++]=sk.nextInt());
        System.out.println("Maximum in Array: "+findMax(arr,n));
    }
    static int findMax(int ar[],int m){
        int max=ar[0];
        for(int i=0;i<m;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }
}
