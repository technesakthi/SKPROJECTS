import java.util.*;
public class replacesumother {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        int sum=0;
        int arr[]=new int[sz];
        for (int i=0;i<sz;i++){
            arr[i]=sk.nextInt();
         
            sum+=arr[i];
        }
        for(int i=0;i<sz;i++){
            sum=sum-arr[i];
            arr[i]=sum;
        }
        for(int i=0;i<sz;i++) System.out.print(arr[i]+" ");
    }
    
}
