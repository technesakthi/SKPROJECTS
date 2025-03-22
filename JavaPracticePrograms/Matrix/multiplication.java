import java.util.*;
public class multiplication {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int row=sk.nextInt();
        int col=sk.nextInt();
        int arr1[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=sk.nextInt();
                
            }
        }
        int arr2[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=sk.nextInt();
                
            }
        }
        int res[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k<col;k++){
                    res[i][j]+=arr1[i][k]*arr2[k][j];
                }

            }
        }
       
        for(int i=0;i<row;i++,System.out.println()){
            for(int j=0;j<col;j++){

                System.out.print(res[i][j]+" ");
            }
        }

    }
    
}
