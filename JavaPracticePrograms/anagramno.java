import java.util.*;
public class anagramno {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num1=sk.nextInt();
        int num2=sk.nextInt();
        int sum1=0,sum2=0;
        int rem1=0,rem2=0;
        while(num1!=0){
            rem1=num1%10;
            sum1+=rem1;
            num1/=10;
            

        }
        while(num2!=0){
            rem2=num2%10;
            sum2+=rem2;
            num2/=10;
        }
        if(sum1==sum2) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
    
}
