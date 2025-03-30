package JavaPracticePrograms.level2;
import java.util.*;
public class uglynum {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        boolean st=false;
        for(int i=2;i<=5;i++){
            if(i==2||i==3||i==5){
                while(num%i==0)
                num/=i;

            }
            if(num==1) st=true;

        }
               
            
        
        
        if(st) System.out.println("YES");
        else System.out.println("NO");
        
    }
    
}
