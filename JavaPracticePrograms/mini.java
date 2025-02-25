import java.util.Scanner;

public class mini {
    public static void main(String[] args) {
         Scanner sk=new Scanner(System.in);
        String nos = sk.nextLine();
        String arr[] = new String[3];
        arr = nos.split(",");
        int n1 = Integer.parseInt(arr[0]);
        int n2 = Integer.parseInt(arr[1]);
        int n3 = Integer.parseInt(arr[2]);
        if((n1<n2)&&(n1<n3)){
            System.out.println("Minimum is "+n1);
            
        }
        else if ((n2<n3)&&(n2<n1)){
            System.out.println("Minimum is "+n2);

        }
        else{
            System.out.println("Minimumum is "+n3);
        }

        
    }

    
}

        
