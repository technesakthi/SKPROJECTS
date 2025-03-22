import java.util.*;
public class multipprenext {
    public static void main(String[] args){
        Scanner sk=new Scanner(System.in);
        int s=sk.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++) arr[i]=sk.nextInt();
        int nar[]=new int[s];
        for(int i=0;i<s;i++){
            if(i==0) nar[i]=arr[i]*arr[i+1];
            else if(i==s-1) nar[i]=arr[i]*arr[i-1];
            else nar[i]=arr[i-1]*arr[i+1];
        }
        for(int i=0;i<s;i++) System.out.print(nar[i]+" ");
    }
    
}
