import java.util.*;
public class transpose {
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
      /*  int res[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<row;i++,System.out.println()){
            for(int j=0;j<col;j++){
                System.out.print(res[i][j]+" ");
                
            }
        }*/
        int temp=0;
        for(int i=0;i<row;i++){
            for(int k=0;k<col;k++){
                temp=arr[i][k];
                arr[i][k]=arr[k][i];
                arr[k][i]=temp;
            }

        }
        for(int i=0;i<row;i++,System.out.println()){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
                
            }
        }


        
    }
    
}
