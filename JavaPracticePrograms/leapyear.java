import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int year=sk.nextInt();
        if ((year%4==0) &&(year%100!=0)||(year%400==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a LeapYear");
        }


        
    }

    
}
