package Labsession;

import java.util.Scanner;

public class characterExtraction {
    static String getFirstMiddleLast (String s){
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        int mid=(s.length())/2;
        sb.append(s.charAt(mid));
        sb.append(s.charAt(s.length()-1));
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sk= new Scanner(System.in);
        String s=sk.nextLine();
        String ans=getFirstMiddleLast(s);
        System.out.println("First Character: "+ans.charAt(0));
        System.out.println("Middle Character: "+ans.charAt(1));
        System.out.println("Last Character: "+ans.charAt(2));

    }

}
