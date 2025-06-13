import java.util.*;
public class LuckyNumber {


    static boolean isLucky(int n){
        if(n<=0) return false;
        else{
            if(n%3==0||n%5==0||n%7==0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;

        }



        if(isLucky(sum)){
            System.out.println("LUCKKY");
        }
        else  System.out.println("NOT_LUCKY");
        
    }
    
}
