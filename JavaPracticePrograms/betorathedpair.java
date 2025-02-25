import java.util.*;
public class betorathedpair {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n1=sk.nextInt();
        int n2=sk.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<=n1;i++){
            if(n1%i==0){
                sum1+=i;
            }
        }
        for(int j=1;j<=n2;j++){
            if(n2%j==0){
                sum2+=j;
            }
        }
        if(sum1==sum2){
            System.out.println("Betroathed Pair");

        }
     
            
         else {
            System.out.println("Not Betroathed pair");
        }


        
    }
    
}
