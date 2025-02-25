import java.math.BigInteger;
import java.util.*;
public class krepaker {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int s=n*n;
        int c=0;
        int s1=s;
        while(s>0){
            c++;
            s/=10;//88209
            
            
        }
        if(c%2!=0) c+=1;
        int p=1;
        for (int i = 0 ;i < c/2; i++) {
            p*=10;
        }
        int x=s1/p;
        int y=s1%p;
        if(x+y==n){
            System.out.println("Krapker no");

        }
        else{
            System.out.println("Not krapker");
        }
            
        
        



        
    }
    
}
