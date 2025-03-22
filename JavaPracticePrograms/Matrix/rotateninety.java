import java.util.*;
public class rotateninety {
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
        /*[20 10 00]
         * [21 11 01]
         * [22 12 02]
         */
        for(int i=0;i<row;i++,System.out.println()){
            for(int j=col-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
                
            }
        }


        
                
            
        
    }
    
}
