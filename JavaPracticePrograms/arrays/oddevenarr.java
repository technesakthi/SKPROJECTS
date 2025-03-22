import java.util.*;
public class oddevenarr {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int size=sk.nextInt();
        int arr[]=new int[size];
        int even=0,odd=0;
        for(int i=0;i<size;i++){
            arr[i]=sk.nextInt();
            if(arr[i]%2==0) even++;
            else odd++;
        }
        System.out.println("Even:" +even+"  " +"Odd:"+odd);
        
    }
    
}
