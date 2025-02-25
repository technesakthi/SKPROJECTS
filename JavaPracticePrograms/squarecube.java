import java.util.*;
public class squarecube {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        System.out.print("the Square numbers are ");
        for(int i=1;i<=n;i++){
            System.out.print(i*i+" ");

            }
        System.out.println();
        System.out.print("The Cube numbers are ");
        for(int i=1;i<=n;i++){
            System.out.print(i*i*i +" ");
        }

        
    }
    
}
