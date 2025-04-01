package JavaPracticePrograms.level2;
import java.util.*;
public class xyaxiscoordinatelies {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int x=sk.nextInt();
        int y=sk.nextInt();
        if(x==0){
            if(y==0) System.out.println("ORIGIN");
            else if(y<0) System.out.println("Negative Y-axis");
            else if(y>0) System.out.println("Positive Y-axis");
        }
        if(y==0){
            if(x<0) System.out.println("Negative X-axis");
            else if(x>0) System.out.println("Positive X-axis");
        }
        

    }
}
