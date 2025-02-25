import java.util.*;
public class descending {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String nos=sk.nextLine();
        String arr[]=new String[4];
        arr=nos.split(",");
        int n1=Integer.parseInt(arr[0]);
        int n2=Integer.parseInt(arr[1]);
        int n3=Integer.parseInt(arr[2]);
        int n4=Integer.parseInt(arr[3]);
        int temp;
        if(n1<n2){
            temp=n1;
            n1=n2;
            n2=temp;
        }
        if(n1<n3){
            temp=n1;
            n1=n3;
            n3=temp;
        }
        if(n1<n4){
            temp=n1;
            n1=n4;
            n4=temp;
        }
        if(n2<n3){
            temp=n2;
            n2=n3;
            n3=temp;
        }
        if(n2<n4){
            temp=n2;
            n2=n4;
            n4=temp;
        }
        if(n3<n4){
            temp=n3;
            n3=n4;
            n4=temp;
        }
        System.out.println(n1+">"+n2+">"+n3+">"+n4);


        
    }
    
}
