package Labsession;

import java.util.*;

public class addsub {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n1=sk.nextInt();
        int n2=sk.nextInt();
        System.out.println("Addition of "+n1+" and "+n2+" = "+(n1+n2));
        System.out.println("Subraction of "+n1+" and "+n2+" = "+Math.abs(n1-n2));

    }
}
