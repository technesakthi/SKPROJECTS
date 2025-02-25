
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n1=sk.nextInt();
        int n2=sk.nextInt();
        char o=sk.next().charAt(0);
        switch(o){
            case 'a':
                System.out.println(n1+n2);
                break;
            case 's':
                 System.out.println(n1-n2);
            }
        }

    }
    
