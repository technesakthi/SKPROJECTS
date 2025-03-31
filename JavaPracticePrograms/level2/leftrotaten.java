package JavaPracticePrograms.level2;
import java.util.*;
public class leftrotaten {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int N=sk.nextInt();
        int l=0,r=0;
        int p=1,c=0;
        int temp=num;
        while(temp!=0){
            c++;
            temp/=10;
        }
        c=c-N;
        int pl=1;
        while(c!=0) {
            p*=10;
            c--;
        }
        l=num%p;
        r=num/p;
        System.out.println(l+""+r);
        
    


    }
    
}
