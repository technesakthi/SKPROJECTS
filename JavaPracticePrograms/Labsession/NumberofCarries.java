package Labsession;

import java.util.Scanner;

public class NumberofCarries {
    static int CarryCount(int num1,int num2){
        int c=0;
        int carry=0;
        while(num1>0||num2>0){
            int rem1=num1%10;
            int rem2=num2%10;
            int sum=rem1+rem2+carry;
            if(sum>=10){
                carry=1;
                c++;

            }
            else{
                carry=0;
            }
            num1/=10;
            num2/=10;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(CarryCount(n1,n2));
    }
}
