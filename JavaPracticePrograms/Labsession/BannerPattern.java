package Labsession;
import java.util.*;
public class BannerPattern {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        for(int i=0;i<n;i++,System.out.println()){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1){
                    System.out.print("* ");
                }
                else if(j<2) System.out.print("* ");
            }
        }
    }
}
