package JavaPracticePrograms.level2;

import java.util.Scanner;

public class HarshadNum {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int temp=num;
        int s=0;
        while(temp!=0){
            s+=temp%10;;
            temp/=10;
        }
        if(num%s==0) System.out.println("HArshad  Number");
        else System.out.println("NOt Harshad number");
    }
    
}
