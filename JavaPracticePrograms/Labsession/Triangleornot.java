import java.util.*;
public class Triangleornot {
    static boolean triaa(int a,int b,int c){
        return a+b>c&&a+c>b&&b+c>a;
    }




    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int s1=sk.nextInt();
        int s2=sk.nextInt();
        int s3=sk.nextInt();
        if(triaa(s1, s2, s3)) System.out.println("It's A Triangle");
        else System.out.println("It's not A Triangle ");
    }
}
