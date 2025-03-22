import java.util.*;
public class rotateoneeighty {
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
        /*[22 21 20 ]
         * [12 11 10]
         * [02 01 00]
         */
        for(int i=row-1;i>=0;i--,System.out.println()){
            for(int j=col-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    
}
