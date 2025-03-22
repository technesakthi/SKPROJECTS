import java.util.*;
public class sumofcolumn {
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
        for(int j=0;j<c;j++){
            sum=0;
            for(int i=0;i<r;i++){
                sum+=arr[i][j];
            }
            System.out.println("The sum of col "+j+" is= "+sum);

        }
    }
    
}
