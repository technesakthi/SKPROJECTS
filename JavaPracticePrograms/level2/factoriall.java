package JavaPracticePrograms.level2;

import java.util.Scanner;

public class factoriall {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        int fact=1;
        while(num>1){
            fact*=num;
            num--;

        }
        System.out.println(fact);
    }
    
}
