import java.util.*;
public class rightleft {
    public static void main(String[] args) {
        Scanner sk=new Scanner (System.in);
        int n1=sk.nextInt();
        int n2=sk.nextInt();
        int temp1=n1,temp2=n2;
        int rem1,c1=0,c2=0;
        while(n1!=0){
            c1++;
            n1/=10;
        }
        while(n2!=0){
            c2++;
            n2/=10;

        }
        int p=1;
        for(int i=0;i<(c1-1);i++){
            p*=10;
        }
        rem1=temp1%10;
        p=p*rem1;
        int y=temp1/(p/10);
        int s1=p+y;
        System.out.println(s1);




        
        
    }
    
}
