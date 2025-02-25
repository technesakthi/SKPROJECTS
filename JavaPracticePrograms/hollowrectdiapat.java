public class hollowrectdiapat {
    public static void main(String[] args) {
        int num=5,r,c;
        for(r=1;r<=num;r++,System.out.println()){
            for(c=1;c<=num;c++){
                if(r==num||r==1||c==1||c==num||r==c||r+c==num+1){
                    System.out.print("1 ");

                }
                else{
                    System.out.print("a ");
                }
            }
        }
    }
    
}
