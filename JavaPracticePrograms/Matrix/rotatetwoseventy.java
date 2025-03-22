import java.util.*;
public class rotatetwoseventy {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int row=sk.nextInt();
        int col=sk.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sk.nextInt();
                
            }
        }
        for(int i=0;i<row;i++,System.out.println()){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
                
            }
        }
        /*[02 12 22 ]
         * [01 11 21]
         * [00 10 20]
         */
        for(int j=col-1;j>=0;j--,System.out.println()){
            for(int i=0;i<row;i++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    
}
