package JavaPracticePrograms.level2;
import java.util.*;
public class yrwekremdays {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int days=sk.nextInt();
        int weeks=days/7;
        int yr=weeks/52;
        int wk=weeks%52;
        int day=yr*365+wk*7;
        day=days-day;
        System.out.println("Number of Years: "+yr);
        System.out.println("Number of Week: "+wk);
        System.out.println("Number of Week: "+day);

        
    }
    
}
