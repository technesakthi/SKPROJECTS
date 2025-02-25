import java.util.*;
public class triangleser {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int se=1;
        for(int i=1;i<=n;i++){
            se+=i+1;
            if(se>n) break;
            else if(se==n) System.out.println("Triangle");
            else System.out.println("not triangle");            
         }
       
        
            
     }
        
}
    

