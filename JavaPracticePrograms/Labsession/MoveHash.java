package Labsession;

import java.util.Scanner;

public class MoveHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ans=new StringBuilder();
        String str=sc.nextLine();
        for(int a=0;a<str.length();a++){
            if(str.charAt(a)=='#'){
                ans.append('#');
            }
        }
        for(int a=0;a<str.length();a++){
            if(str.charAt(a)!='#'){
                ans.append(str.charAt(a));
            }
        }
        System.out.println(ans.toString());
    }
}
