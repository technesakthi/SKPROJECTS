import java.util.*;
public class difftranspose {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int row=sk.nextInt();
        int col=sk.nextInt();
        if(row==col){
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sk.nextInt();
                
            }
        }
        int res[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j]=arr[j][i];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j]=arr[i][j]-res[i][j];
                
            }

        }
        for(int i=0;i<row;i++,System.out.println()){
            for(int j=0;j<col;j++){
                System.out.print(res[i][j]+" ");
                
            }
        }
    }
    else System.out.print("CAnnot be performed");
        
    }
    
}
