import java.util.*;
public class anagramno {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num1=sk.nextInt();
        int num2=sk.nextInt();
        int rem1=0;
        int rem2=0;
        int sts=0;
        while(num1!=0){
            rem1=num1%10;
            while(num2!=0){
                rem2=num2%10;
                if(rem1==rem2){
                    sts=1;
                    break;
                }
                else num2=num2/10;
            }
            num1=num1/10;


        }
        if(sts==1) System.out.println("Anagram");
        else System.out.println("Not anagram");

        
    }
    
}
