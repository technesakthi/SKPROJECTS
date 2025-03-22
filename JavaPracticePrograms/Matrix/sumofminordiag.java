import java.util.*;
public class sumofminordiag {
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
                if(i+j==r-1){
                     sum+=arr[i][j];
                }

                
            }
        }
        System.out.print("Sum of Minor diagonal "+ sum);
    /*
     * [00 01 02 03]       [00 01 02]
     * [10 11  12 13]      [10 11  12]
     * [20 21  22 23]      [20  21  22]
     * [30 31 32  33]
     */
    }
}
