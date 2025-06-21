package Labsession;
import java.util.Scanner;
//Happy Numbers--> 1,44,100,86
public class HappyNumber {

    static int sum(int n){
        int s=0;
        int k=0;
        while(n!=0){
            s=n%10;
            n/=10;
            k+=s*s;

        }
        return k;
    }
    static boolean Happynum(int n){
        while(n>9){
            n=sum(n);
            System.out.println(n);

        }
        if(n==1||n==7) return true;
        else return false;


    }
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();

       if(Happynum(num)) System.out.println(num+" is a happy number");
        else System.out.println(num+" is not a happy number");
    }
}
