package Labsession;

import java.util.*;
public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int a=sk.nextInt();
        int b=sk.nextInt();
        int c=sk.nextInt();
        
        double discriminant=b*b-(4*a*c);
        Roots(a,b,c,discriminant);

  }
   static void  Roots(int x,int y,int z,double dis){
        if (x==0) return;
        if(dis==0){
            double root=-y/(2*x);
            System.out.println("RS");
            System.out.println("Roots: " +root);
        }
       else if(dis>0){
           double root1=(-y+Math.sqrt(dis))/(2*x);
            double root2=(-y-Math.sqrt(dis))/(2*x);
           System.out.println("RD");
           System.out.println("Roots: " +root1 + " and  " + root2);
       }
        else if(dis<0){
            double re=-y/(2*x);
            double img=(Math.sqrt(-dis))/(2*x);
            System.out.println("RC");
            System.out.println("Roots1: " +re+" + "+img+"i ");
            System.out.println("Roots2: " +re+" - "+img+"i ");
        }
        else System.out.println("Invalid Input");

    
   }



    
}