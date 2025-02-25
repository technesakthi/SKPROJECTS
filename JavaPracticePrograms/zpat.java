public class zpat {
    public static void main(String[] args) {
        int num=5;
        int row,col;
        for (row=1;row<=num;row++,System.out.println("")){
            for(col=1;col<=num;col++){
                if(row==1||row==num){
                    System.out.print(1+" ");

                }
                else if(row+col==num+1){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
        }
    }
}

