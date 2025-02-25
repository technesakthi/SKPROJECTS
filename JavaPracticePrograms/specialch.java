import java.util.*;
public class specialch {
    public static void main(String[] args) {
        Scanner ob=new Scanner (System.in);
        char c= ob.next().charAt(0);
        if (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Vowel");

        }
        else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }


        

        
    }
    
}
