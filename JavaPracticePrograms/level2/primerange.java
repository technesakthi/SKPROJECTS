package JavaPracticePrograms.level2;
import java.util.*;
public class primerange {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int rg1=sk.nextInt();
        int rg2=sk.nextInt();
        for(int j=rg1;j<=rg2;j++){
            boolean pr = true;
            
            for (int i = 2; i * i <= j; i++) { 
                if (j % i == 0) {
                    pr= false;
                    break;
                }
            }
            
            if (pr) {
                System.out.print(j + " ");
            }
        }

    }
    
}
