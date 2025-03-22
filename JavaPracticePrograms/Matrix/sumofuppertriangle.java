import java.util.*;
public class sumofuppertriangle {
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
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i<=j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.print(sum);
        

    }
    
}
