package Labsession;

import java.util.Scanner;

//a^3 +a^2.b+2.a^2.b+2.a.b^2+a.b^2+b^3
public class mathexpression {
    static int findValue(int a,int b){
        int ans=(int)(Math.pow(a,3)+a*a*b+2*a*a*b+2*a*b*b+a*b*b+Math.pow(b,3));
        return ans;

    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int a=sk.nextInt();
        int b=sk.nextInt();
        System.out.println(findValue(a,b));
    }
}
