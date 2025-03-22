import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz=sk.nextInt();
        int arr[]=new int[sz];
        
        boolean sts=false;
        for(int i=0;i<sz;i++) arr[i]=sk.nextInt();
        int search=sk.nextInt();
        for(int j=0;j<sz;j++){
            if(arr[j]==search) {
                System.out.print("Element found at:"+j);
                sts=true;
                break;
            }
            

        }
        if(!sts) System.out.print("Element not found");
        

    }
    
}
