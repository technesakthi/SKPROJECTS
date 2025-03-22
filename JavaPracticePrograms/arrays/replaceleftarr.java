import java.util.*;
public class replaceleftarr {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int size=sk.nextInt();
        int sum=0;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sk.nextInt();
            sum+=arr[i];
        
        }
        for(int i=size-1;i>=0;i--){
            sum=sum-arr[i];
            arr[i]=sum;


            
            
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    
}
