import java.util.*;
public class oddevenpat {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int row,col;
        if(num%2==0){
            for(row=1;row<=num;row++,System.out.println()){
                for(col=1;col<=num;col++){
                    if(row==1||col==1||row==2||col==2||row==num||col==num||row==num-1||col==num-1){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }

                }
            }
        }
        else{
            int mid=(num+1)/2;
            for(row=1;row<=num;row++,System.out.println()){
                for(col=1;col<=num;col++){
                    if(row==mid&&col==mid){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                    
                }
            }
        }


        
    }

    
}
