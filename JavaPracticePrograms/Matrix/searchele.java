import java.util.*;
public class searchele {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int r=sk.nextInt();
        int c=sk.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sk.nextInt();
            }
        }
        for(int i=0;i<r;i++,System.out.println()){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        int search=sk.nextInt();
        boolean found=false;
        int k=-1,l=-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==search){
                    k=i;
                    l=j;
                    found=true;
                    break;

             }
         }


       }
       if(found) System.out.println("Element found at "+k+"row "+l+" column");
       else System.out.println("element not found");

    }
    
}
