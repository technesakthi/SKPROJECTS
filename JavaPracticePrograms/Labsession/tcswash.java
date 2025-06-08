package Labsession;

import java.util.Scanner;
public class tcswash {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int weight=sk.nextInt();
        if (weight<=2000 && weight>0){
            System.out.println("Estimated Time:25 minutes");
        
        }
        else if (weight>=2001 && weight <=4000){
            System.out.println("Estimated time:35 minutes");
        }
        else if(weight >=4000 && weight <=7000){
            System.out.println("Estimated time:45 minutes");
        }
        else if (weight>7000){
            System.out.println("OVERLOAD");
        }
        else if(weight ==0){
            System.out.println("THe estimated Time:0 minutes");

        }
        else{
            System.out.println("INVALID INPUT");
        }
        
    }
    
}
