import java.util.*;
public class majorityelement {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int arr[]=new int[n];
        int c=0,k=-1;
        for(int i=0;i<n;i++) arr[i]=sk.nextInt();
        for(int i=0;i<n;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j])  c++;
            
            }
            if(c>n/2){
                k=arr[i];
                break;
            }



        }
        if(k!=-1) System.out.println("Major:"+k);
        else System.out.println("NO MAjority");


        


        
    }
    
}
