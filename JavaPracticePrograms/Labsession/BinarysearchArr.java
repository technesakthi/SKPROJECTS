package Labsession;

import java.util.Scanner;

public class BinarysearchArr {
    static Boolean BinSearch(int arr[],int m,int s){
        int start=0,end=m-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==s){
                return true;
            }
            else if(arr[mid]>s){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return false;

    }



    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int arr[]=new int[n];
        for(int a=0;a<n;a++){
            arr[a]=sk.nextInt();
        }
        int sc=sk.nextInt();
        System.out.print(BinSearch(arr,n,sc));
    }
}
