package Labsession;
import java.util.*;

public class AddDividetwo {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int a = sk.nextInt();
        int b = sk.nextInt();
        int sum = a + b;
        if(sum%2==0){
            System.out.println(sum+" is even");
        }
        else{
            System.out.println(sum+" is odd");
        }
    }
}
