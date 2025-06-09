package Labsession;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String s=sk.nextLine();
        StringBuilder ans=new StringBuilder();
        int c=1;
        for(int i=1;i<=s.length();i++){
            if(i<s.length()&& s.charAt(i)==s.charAt(i-1)){
                c++;

            }
            else{
                ans.append(s.charAt(i-1));
                if(c>1){
                    ans.append(c);
                }
                c=1;
            }
        }
        System.out.println(ans.toString());



    }
}
