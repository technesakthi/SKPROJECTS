import java.util.*;
public class triangleside {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String nos= sk.nextLine();
        String arr[]=new String[3];
        arr=nos.split(" ");
        int a=Integer.parseInt(arr[0]);
        int b=Integer.parseInt(arr[1]);
        int c=Integer.parseInt(arr[2]);
        if(((a+b)>c)&&((b+c)>a)&&((c+a)>b)){
        
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }

        
    }
    
}
