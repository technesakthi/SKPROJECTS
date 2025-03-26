import java.util.*;
public class rotatespecified {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        int []arr=new int[sz];
        int rot[]=new int[sz];
        for(int i=0;i<sz;i++){
            arr[i]=sk.nextInt();

        }
        System.out.println();
        int m=0;
        int n=sk.nextInt();
        for(int i=n;i<sz;i++){
            rot[m]=arr[i];
            m++;
        }
        
        for(int i=0;i<l;i++){
            rot[m]=arr[i];
            m++;
        }
        for(int i=0;i<n;i++){
            System.out.print(rot[i]+" ");
        }
    }
    
}
