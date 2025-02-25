import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        if ((n1+n2)%2==0){
            System.out.println("Even");

        }
        else{
            System.out.println("Odd");
        }

        
    }
    
}
