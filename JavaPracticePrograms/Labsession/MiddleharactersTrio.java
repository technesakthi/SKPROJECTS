package Labsession;

import java.util.Scanner;

public class MiddleharactersTrio {
    static String getMiddleThree(String s){
        StringBuilder ans= new StringBuilder();
        int mid=(s.length())/2;
        ans.append(s.charAt(mid-1));
        ans.append(s.charAt(mid));
        ans.append(s.charAt(mid+1));
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sk= new Scanner(System.in);
        String str=sk.nextLine();
        System.out.println(getMiddleThree(str));
    }
}
