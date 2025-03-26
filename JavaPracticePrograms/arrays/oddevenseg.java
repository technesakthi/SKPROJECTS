import java.util.*;
public class oddevenseg {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        int arr[]=new int[sz];
        int arr1[]=new int[sz];
        int d=0;
        for(int i=0;i<sz;i++){
            arr[i]=sk.nextInt();
        }
        for(int i=0;i<sz;i++){
            if(arr[i]%2!=0){
                arr1[d]=arr[i];
                d++;

            }
        }
        for(int i=0;i<sz;i++){
            if(arr[i]%2==0){
                arr1[d]=arr[i];
                d++;
            }
        }
        
        for(int i=0;i<sz;i++){
            System.out.print(arr1[i]+" ");
        }
    
    
    
    }
    
}
