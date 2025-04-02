package JavaPracticePrograms.level2;
import java.util.*;
public class amicablepairs {
    public class AmicableNumbers {
        static int sumOfDivisors(int num) {
            int sum = 1; 
            int i = 2;
            while (i * i <= num) {
                if (num % i == 0) {
                    sum += i;
                    if (i != num / i) {
                        sum += num / i;
                    }
                }
                i++;
            }
            return sum;
        }
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num1=sk.nextInt();
        int num2=sk.nextInt();
        int a=num1;
        while (a<= num2) {
            int b = sumOfDivisors(a);
            if (b > a && b <= num2 && sumOfDivisors(b) == a) { 
                System.out.println(a + " " + b);
            }
            a++;
        }
    }
    
}
}
