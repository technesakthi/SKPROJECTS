import java.util.*;
public class GST {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        char ch=sk.next().charAt(0);
        double amt=sk.nextDouble();
        double ans=0;
        switch(ch){
            case 'A':
                System.out.printf("%.2f",amt);
                break;
            case 'B':
                amt=amt-(amt*0.02);
                System.out.printf("%.2f",amt);
                break;
            case 'C':
                amt=amt-(amt*0.05);
                System.out.printf("%.2f",amt);
                break;

            case 'D':
                amt=amt-(amt*0.12);
                System.out.printf("%.2f",amt);
                break;
            case 'E':
                amt=amt-(amt*0.18);
                System.out.printf("%.2f",amt);
                break;
            case 'F':
                amt=amt-(amt*0.28);
                System.out.printf("%.2f",amt);
                break;

            default: System.out.println("Invalid choice");


        }


    }
}