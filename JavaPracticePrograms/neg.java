import java.util.Scanner;
public class neg {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n1=sk.nextInt();
        int n2=sk.nextInt();
        System.out.println(n1+n2);
        if ((n1-n2)<0){
            System.out.println((n1-n2)*-1);

        }
        else{
            System.out.println(n1-n2);
        }

        
    }
    
}
