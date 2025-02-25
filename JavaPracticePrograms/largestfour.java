import java.util.*;
public class largestfour {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String nos = sk.nextLine();
        String arr[] = new String[4];
        arr = nos.split(",");
        int n1= Integer.parseInt(arr[0]);
        int n2= Integer.parseInt(arr[1]);
        int n3= Integer.parseInt(arr[2]);
        int n4=Integer.parseInt(arr[3]);
        if((n1>n2)&&(n1>n3)&&(n1>n4)){
            System.out.println("Largest is "+n1);

        }
        else if ((n2>n1)&&(n2>n3)&&(n2>n4)){
            System.out.println("Largest is "+n2);
        }
        else if((n3>n1)&&(n3>n2)&&(n3>n4)){
            System.out.println("Largest is "+n3);
        }
        else{
            System.out.println("Largest is "+n4);
        }


        
    }

    
}


        

