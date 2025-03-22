import java.util.*;
public class countzcon {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int s=sk.nextInt();
        int zc=0,oc=0;
        int arr[]=new int[s];
        for(int i=0;i<s;i++) {
            arr[i]=sk.nextInt();
            if(arr[i]==0) zc+=1;
            if(arr[i]==1) oc+=1;
        }
        System.out.println("zc="+zc);
        System.out.println("oc="+oc);

    }
    
}
