import java.util.*;
public class identical{
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int row1=sk.nextInt();
        int col1=sk.nextInt();
        int arr1[][]=new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                arr1[i][j]=sk.nextInt();

            }
        }
        System.out.println();
        int row2=sk.nextInt();
        int col2=sk.nextInt();
        int arr2[][]=new int[row2][col2];
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                arr2[i][j]=sk.nextInt();

            }
        }
        if(row1!=row2 && col1!=col2) System.out.print("Not identical");
        boolean d=false;
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                if(arr1[i][j]==arr2[i][j]) d=true;
                else d=false;
            }
        }
        if(d) System.out.println("Identical");
        else System.out.println("Not identical");
        
    }
    
}
