import java.util.*;
public class digicount {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int digits= (int)Math.log10(num)+1;
        System.out.println(digits);
        
    }
    
}
