import java.util.*;
public class sumarr{
    public static void main(String[] args){
        Scanner sk=new Scanner(System.in);
        int size=sk.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            arr[i]=sk.nextInt();
            sum+=arr[i];

        }
        System.out.print(sum);

    }

}