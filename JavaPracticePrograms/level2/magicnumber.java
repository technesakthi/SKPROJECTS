package JavaPracticePrograms.level2;
import java.util.*;
public class magicnumber {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int sum=0;
        int temp=num;
        while(temp!=0){
            sum+=temp%10;
            temp/=10;
        }
        int rev=0,rem=0;
        temp=sum;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if((sum*rev)==num) System.out.println("MAGIC Number");
        else System.out.println("Not A Magic Number");

    }
    
}
