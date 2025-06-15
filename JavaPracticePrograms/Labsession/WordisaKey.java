package Labsession;

import java.util.Scanner;

public class WordisaKey {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String str=sk.nextLine().toLowerCase();
        switch(str){
            case "break", "case", "continue", "default", "defer",
                 "else", "for", "func", "goto", "if", "map",
                 "range", "return", "struct", "type", "var":
                System.out.println(str+" is a Keyword");
            break;
            default:
                System.out.println(str+" is not a Keyword");
        }

    }
}
