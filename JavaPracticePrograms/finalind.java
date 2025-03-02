import java.util.*;
public class finalind {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++,System.out.println()){
            if(i%2==0) System.out.print(i+1+ " ");
            for(int j=1;j<=num;j++) System.out.print(i+" ");
            if(i%2!=0) System.out.print(i+1+" ");


        }
    }
}
    

