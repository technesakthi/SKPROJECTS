package Labsession;

import java.util.Scanner;

public class RotateArr {

        static void Reverse(int arr[],int start,int end){
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            Scanner sk=new Scanner(System.in);
            int n=sk.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sk.nextInt();
            }
            int k=sk.nextInt();
            Reverse(arr,0,n-1);
            Reverse(arr,0,k-1);
            Reverse(arr,k,n-1);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
}
