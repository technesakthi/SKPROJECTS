import java.util.*;
public class boundary {
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
        System.out.println();
            for(int j=0;j<col;j++){
                 System.out.print(arr[0][j]+" ");
            }
            System.out.println();
            for(int i=0;i<row;i++){
                System.out.print(arr[i][0]+" ");
           }
           System.out.println();
           for(int i=0;i<row;i++){
            System.out.print(arr[i][row-1]+" ");
       }
       System.out.println();
       for(int j=0;j<col;j++){
        System.out.print(arr[row-1][j]+" ");
   }

        
    }
}
