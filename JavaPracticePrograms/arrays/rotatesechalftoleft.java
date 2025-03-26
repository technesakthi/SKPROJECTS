import java.util.*;
public class rotatesechalftoleft {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int size=sk.nextInt();
        int arr[]= new int [size];
        int count=0;
        for (int itr=0;itr<size;itr++){
            arr[itr]=sk.nextInt();
        }
        int rot=sk.nextInt();
        rot=rot%(size-(size/2));
        while(count<rot)
        {
            int temp=arr[size/2];
        for(int i=size/2;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=temp;
        count++;
        }

        

        



        
    }
    
}
