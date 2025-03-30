package JavaPracticePrograms.level2;
import java.util.*;
public class amicablepairs {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num1=sk.nextInt();
        int num2=sk.nextInt();
        for(int i=num1;i<=num2;i++){
            int sum1=0;
            for(int j=1;j<=i/2;j++){
                if(j%i==0){
                    sum1+=j;
                }
            }
            if (sum1 > num1 && sum1 <= num2) { 
                int sum2 = 0;
                for (int j = 1; j <= sum1 / 2; j++) {
                    if (sum1 % j == 0) {
                        sum2 += j;
                    }
                }
                if (sum2 == num1) {
                    System.out.println(num1 + " and " + sum1);
                }
            }

        }
        
    }
    
}
