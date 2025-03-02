import java.util.*;
public class findgreatdigits {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int temp=0,rem=0;
        while(num!=0){
            rem=num%10;
            if(temp<rem){
                temp=rem;
            }
            num=num/10;

        }
        System.out.print(temp);
        
    }
    
}
