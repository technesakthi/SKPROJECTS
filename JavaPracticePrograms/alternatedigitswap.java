import java.util.*;
public class alternatedigitswap {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int an=0,swap=0,di=0,dis=0,pow=1,c=0;
        int temp=num;
        while(num!=0){
            c++;
            num/=10;
        }
        num=temp;
        if(c%2==1){
            di=num%10;
            num/=10;
        }
        while(num!=0){
            dis=num%100;
            swap=(dis%10)*10+(dis/10);
            an=an+(swap*pow);
            pow*=100;
            num/=100;

        }
        if(c%2==1) System.out.print(an*10+di);
        else System.out.print(an);


        
    }
    
}
