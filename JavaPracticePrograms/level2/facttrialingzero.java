package JavaPracticePrograms.level2;
import java.util.*;
public class facttrialingzero {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int zc=0,fact=1;
        while(num>1){
            fact*=num;
            num--;

        }
        while(fact>0){
            if(fact%10==0) zc++;
            fact/=10;

        }
        System.out.print(zc);
        
    }
    
}
