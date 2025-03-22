import java.util.*;
public class biotonic {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        int arr[]=new int[sz];
        for(int i=0;i<sz;i++) arr[i]=sk.nextInt();
        boolean inc=true;
        boolean dec=false;
        for(int i=0;i<sz-1;i++){
            if(arr[i]>arr[i+1]){
                if(!dec){
                    inc=false;
                    dec=true;
                }
            }
            else{
                if(!inc) System.out.print("NOn biotonic");
            }
        }
        System.out.print("Biotonic");
        
        
    }
    
}
