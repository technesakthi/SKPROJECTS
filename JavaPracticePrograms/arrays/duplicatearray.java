import java.util.*;
public class duplicatearray {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        int []arr=new int[sz];
        for(int i=0;i<sz;i++){
            arr[i]=sk.nextInt();

        }
        int m=0,k=0;
        int dup[]=new int[sz]; 
        for(int i=0;i<sz;i++){
            for(int j=i+1;j<sz;j++){
                if(arr[i]==arr[j]) {
                    k++;
                }
                
            }
            if(k!=1){
                dup[m]=arr[i];
                m++;
            }
            k=0;
        }
        for(int i=0;i<sz;i++){
           if(dup[i]!=0){
            System.out.print(dup[i]+" ");
           }
        }
    }
    
}
