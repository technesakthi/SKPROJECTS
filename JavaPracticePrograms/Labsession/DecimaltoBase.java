package Labsession;

import java.util.Scanner;

public class DecimaltoBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int base=sc.nextInt();
        StringBuilder ans=new StringBuilder();
        while(num!=0){
            int rem=num%base;
            char dig;
            if(rem<10){
                dig=(char) ('0'+rem);

            }
            else{
                dig=(char) ('A'+rem-10);
            }
            ans.append(dig);
            num/=base;
        }
        System.out.println(ans.reverse());
    }
}
