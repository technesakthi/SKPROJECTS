import java.util.*;
public class factors{
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0 && n!=i){
                System.out.print(i+",");
            }
            else if(n%i==0 && n==i){
                System.out.print(i);
            }
        }

        
    }
}
