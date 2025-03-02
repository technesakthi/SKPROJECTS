import java.util.*;
public class reverseklastdigits {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int k=sk.nextInt();
        int pow=1,rev=0;
        int rem=0,ans=0;
        while(k!=0){
            pow*=10;
            k--;
        }
        int fs=num/pow;
        int re=num%pow;

        while(re!=0){
            rev=re%10;
            rem=rem*10+rev;
            re/=10;
            
        }
        ans=(fs*pow)+rem;
        
        System.out.println(ans);





    }
    
}
