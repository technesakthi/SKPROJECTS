package JavaPracticePrograms.level2;
import java.util.*;
public class triangularnum {
    public static void main(String[] args) {
        

    Scanner sk=new Scanner(System.in);
    int num=sk.nextInt();
    int mi=0;
    boolean st=false;
    for(int i=1;i<=num;i++){
        if(mi==num){
            st=true;
            break;
        }
        mi+=i;
    }
    if(st) System.out.println("TRIangular NUMBER");
    else System.out.println("NOT a TRIangular Number");
}
}   

