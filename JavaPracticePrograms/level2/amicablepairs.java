package JavaPracticePrograms.level2;
import java.util.*;
public class amicablepairs {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num1=sk.nextInt();
        int num2=sk.nextInt();
        int sum1=0,sum2=0;
        for(int i=num1;i<=num2;i++){
            for(int j=1;j<i;j++){
                if(i%j==0) sum1+=j;
            }
            
        }
    }
    
}
