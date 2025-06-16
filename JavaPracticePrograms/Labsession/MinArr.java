package Labsession;

import java.util.Scanner;

public class MinArr {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;arr[i++]=sk.nextInt());
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum in Array: "+min);
    }
}
