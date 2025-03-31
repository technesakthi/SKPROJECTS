package JavaPracticePrograms.level2;
import java.util.*;
public class frequencydigits {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int temp=num;
        int g=0,c=0;
        while(temp!=0){
            c=temp%10;
            if(c>g) g=c;
            temp/=10;
        }
        c=0;
        int m=0;
        for(int i=0;i<=g;i++,temp=num){
            while(temp!=0){
                m=temp%10;
                if(i==m) c++;
                temp/=10;
            }
            System.out.println(i+" occurs "+c+" times");
            c=0;

        }
        
            

            
        
    }
    
}
