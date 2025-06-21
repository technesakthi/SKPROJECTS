package Labsession;

import java.util.Scanner;

public class ASCIISum {
    static int asciisum(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum+=(int)s.charAt(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sk= new Scanner(System.in);
        String str=sk.nextLine();
        System.out.println(asciisum(str));
    }
}
