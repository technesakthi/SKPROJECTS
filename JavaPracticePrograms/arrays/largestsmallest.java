import java.util.*;
public class largestsmallest {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        int arr[]=new int[sz];
        
        for(int i=0;i<sz;i++) arr[i]=sk.nextInt();
        int small=arr[0],lar=0;
        for(int i=0;i<sz;i++){
            if(arr[i]<small){
                small=arr[i];
                
            }
            else if(arr[i]>lar){
                lar=arr[i];
                
            }
        }
        System.out.println("Smallest:"+small+"  Largest:"+lar);
    }
    
}
