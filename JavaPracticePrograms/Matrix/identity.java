import java.util.*;
public class identity {
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
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    if(arr[i][j]==1) fo=true;
                    else fo=false;
                }
                else if(i!=j){
                  if(arr[i][j]==0) fo=true;
                }
            }
        }
        if(!fo) System.out.print("Identity");
        else System.out.print("NOt identity");
    }
    
}
