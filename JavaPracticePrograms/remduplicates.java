import java.util.*;
public class remduplicates{
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num =sk.nextInt();
        int newNum = 0;
        int seen = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;
            int temp = seen;
            int found = 0;

            while (temp > 0) {  
                if (temp % 10 == digit) {
                    found = 1;
                    break;
                }
                temp /= 10;
            }

            if (found==0) {
                newNum = digit * place + newNum;
                place *= 10;
                seen = seen * 10 + digit; 
            }

            num /= 10; 
        }

        System.out.println(newNum); 
    }
}
