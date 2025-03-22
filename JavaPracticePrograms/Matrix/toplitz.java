import java.util.*;
public class toplitz {
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
        boolean fo=false;
        for(int i=0;i<row-1;i++){
            for(int j=0;j<col-1;j++){
                    if(arr[i][j]==arr[i+1][j+1]) {
                        fo=true;
                        break;
                    }
                    if(fo) break;

                

            
            }
        }
        if(fo) System.out.print("Toplitz");
        else System.out.print("NOt Toplitz");
    }
    
}
