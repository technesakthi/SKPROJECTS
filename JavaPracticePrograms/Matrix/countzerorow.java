import java.util.*;
public class countzerorow {
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
        int tem=-1;
        int c=0,co=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==0){
                    c++;
                    if(i==0&&j==0) co=c;
                }
                if(co<c){
                    tem=i;
                    co=c;
                    
                }
                else if(co==c) {
                    if(tem<i) tem=i;
                }
                
            }
            c=0;
            


        }
        System.out.print(tem);

    }
    
}
