import java.util.*;
public class Superprime {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        for(int i=2;i<=n;i++){
            if(i%2!=i){
                System.out.println(i);
            }
        }
    
    }
    
}
