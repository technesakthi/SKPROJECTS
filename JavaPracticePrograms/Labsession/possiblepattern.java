package Labsession;

import java.util.*;

public class possiblepattern {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String s=sk.nextLine();
        for(int i=0;i<s.length();i++,System.out.print(" ")){
            for(int j=1;j<=i+1;j++){
                System.out.print(s.charAt(i));
            }

        }





    }
}
