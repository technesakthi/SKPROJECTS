import java.util.*;
public class monotonic {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        boolean asc=true,desc=true;
        int arr[]=new int[sz];
        for(int i=0;i<sz;i++) arr[i]=sk.nextInt();
        for(int i=0;i<sz-2;i++){
            if(arr[i]>arr[i+1]){
                asc=false;
            }

        }
        for(int i=0;i<sz-2;i++){
            if(arr[i]<arr[i+1]){
                desc=false;
            }

        }

        if(asc||desc) System.out.print(" Monotonic");
        else System.out.print("non monotonic");


        
    }
    
}
