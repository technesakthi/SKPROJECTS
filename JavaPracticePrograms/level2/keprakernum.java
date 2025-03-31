package JavaPracticePrograms.level2;

import java.util.*;

public class keprakernum {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int n=num*num;
        int temp=n;
        int c=0;
        while(temp!=0){
            c++;
            temp/=10;
        }
        if(c%2!=0) c+=1;
        int p=1;
        for(int i=0;i<c/2;i++){
            p*=10;

        }
        int x=n%p;
        int y=n/p;
        if(x+y==num) System.out.println("Kepraker NUMBER");
        else System.out.println("NOT kepraker Number");
    }
    
}
