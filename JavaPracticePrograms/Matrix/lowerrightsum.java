import java.util.*;
public class lowerrightsum {
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
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j>=row-(i+1))
                sum+=arr[i][j];



            }
        }
        System.out.println(sum);

        
    }
    
}
