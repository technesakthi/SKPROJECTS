package Labsession;

import java.util.Scanner;

public class MaxSubArrSum {
    static int MaxSubSum(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }

        }
        return max;
    }




    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int arr[]=new int[n];
        for(int a=0;a<n;a++){ arr[a]=sk.nextInt();}
        System.out.print(MaxSubSum(arr));
    }
}
