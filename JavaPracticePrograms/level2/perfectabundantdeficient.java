package JavaPracticePrograms.level2;
import java.util.*;
public class perfectabundantdeficient {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int mm=0;
        for(int i=1;i<num;i++){
            if(num%i==0) mm+=i;
        }
        if(num==mm) System.out.println("PERFECT Number");
        else if(num<mm) System.out.println("Abundant Number");
        else System.out.println("Deficient Number");
    }
    
}
