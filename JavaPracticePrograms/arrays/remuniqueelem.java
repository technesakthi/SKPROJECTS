import java.util.*;
public class remuniqueelem {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        int arr[]=new int[sz];
        int c=0,nn=0;
        int are[]=new int[sz];
        for(int i=0;i<sz;i++) arr[i]=sk.nextInt();
        for(int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==1){
                are[nn]=arr[i];
                nn++;

            }
            c=0;
        }
        for(int i=0;i<sz;i++) {
            if(are[i]!=0) c++;
        }
        int[] res=new int[c];
        int m=0;
        for(int i=0;i<c;i++){
            if(are[i]!=0){
                res[m]=are[i];
                m++;
            }
        }
        for(int i=0;i<m;i++) System.out.print(res[i]+" ");
        
    }
    
}
