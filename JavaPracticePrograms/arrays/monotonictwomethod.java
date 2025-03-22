import java.util.*;
public class monotonictwomethod {
    static boolean increase(int arr[],int sz){
        boolean inc=true;
        for(int i=0;i<sz-2;i++){
            if(arr[i]>arr[i+1]) inc=false;
        }
        return inc;
    }
    static boolean decrease(int arr[],int sz){
        boolean des=true;
        for(int i=0;i<sz-2;i++){
            if(arr[i]>arr[i+1]) des=false;
        }
        return des;
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        int arr[]=new int[sz];
        for (int i=0;i<sz;i++) arr[i]=sk.nextInt();
        if(increase(arr,sz)||decrease(arr,sz)) System.out.print("Monotonic");
        else System.out.print("NOn monotonic");
        
    }
    
}
