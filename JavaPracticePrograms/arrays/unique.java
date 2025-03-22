import java.util.*;
public class unique {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        int arr[]=new int[sz];
        int c=0;
        for(int i=0;i<sz;i++) arr[i]=sk.nextInt();
        for(int i=0;i<sz;i++){
            for(int j=i+1;j<sz;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==1) System.out.print(arr[i]+" ");
            

        }
        
    }
    
}
