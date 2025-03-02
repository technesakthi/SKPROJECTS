import java.util.*;
public class changevenodd {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int res=0,rem;
        int t=n;
        while(n!=0){
            rem=n%10;
            if(rem%2==0){
                res=rem+res*10;
            }
            n=n/10;
        }
        while(t!=0){
            rem=t%10;
            if(rem%2!=0){
                res=rem+res*10;
            }
            t=t/10;
        }
        System.out.println(res);

           

        
        
        
    }
    
}
