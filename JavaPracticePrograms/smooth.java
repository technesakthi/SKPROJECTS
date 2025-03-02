import java.util.*;
public class smooth {
    public static void main(String[] args ){
        Scanner sk=new Scanner(System.in);
        int fac=sk.nextInt();
        int n=sk.nextInt();
        int itr=2;
        int prime=0;
        while(fac>1){
            while(fac%itr==0){
                fac=fac/itr;
                prime=itr;
                itr++;
            }
            if(prime<=n){
                System.out.println("Smooth number");
    
            }
            else{
                System.out.println("Not smooth");
            }
           
        }
        
    }

    
}
