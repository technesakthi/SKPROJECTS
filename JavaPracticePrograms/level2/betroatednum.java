package JavaPracticePrograms.level2;

import java.util.*;

public class betroatednum {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num1=sk.nextInt();
        int num2=sk.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<=num1;i++){
            if(num1%i==0) sum1+=i;
        }
        for(int i=1;i<=num2;i++){
            if(num2%i==0) sum2+=i;
        }
        if(sum1==sum2) System.out.println("BETROAtED pairs");
        else System.out.println("NOT BEtroated Pair");
    }
    
}
