import java.util.*;
public class minimumswap {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        int arr[]=new int[sz];
        int swap=0;
        for(int i=0;i<sz;i++){
            arr[i]=sk.nextInt();
        }
        System.out.println();
        int k=sk.nextInt();
        int l=0;
        int r=sz-1;
        while(l<r){
            while(arr[l]<=k) l++;
            while(arr[r]>k) r--;
            if(l<r) swap++;
            l++;
            r--;

        }
        System.out.print(swap);
    }
    
}
