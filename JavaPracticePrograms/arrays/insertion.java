import java.util.*;
public class insertion {
    public static void main(String[] args) {
        Scanner sk=new Scanner (System.in);
        int sz=sk.nextInt();
        int arr[]=new int[sz];
        int arn[]=new int[sz+1];
        for(int i=0;i<sz;i++) arr[i]=sk.nextInt();
        int ele=sk.nextInt();
        int pos=sk.nextInt();
        if(pos>sz) System.out.print("Error");
        arn[pos]=ele;
        int  c=0;
        for(int i=0;i<sz;i++){

            if(i==pos) c++;
            arn[c]=arr[i];
            c++;

        }
        
        for(int i=0;i<sz+1;i++){
            System.out.print(arn[i]+" ");
        }
    }

        
 }
    

