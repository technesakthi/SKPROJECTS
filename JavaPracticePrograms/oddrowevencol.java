public class oddrowevencol {
    public static void main(String[] args) {
        int num=5,row,col;
        for(row=1;row<=num;row++,System.out.println()){
            int n1=1;
            int n2=2;
            for(col=1;col<=row;col++){
                if(row%2!=0){
                    System.out.print(n1+" ");
                    n1+=2;
                }
                else{
                    System.out.print(n2+" ");
                    n2+=2;
                }
            }

        }
        
    }
    
}
