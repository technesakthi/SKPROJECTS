import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        if (num%100 ==0){
            System.out.println("Can be Divided , Multiple of 100");

        }
        else{
            System.out.println("Not a multiple of !00");
        }

        
    }
    
}
