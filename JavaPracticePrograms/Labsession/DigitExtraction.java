package Labsession;

import java.util.*;

public class DigitExtraction {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String str=sk.nextLine();
        System.out.println(filterDigits(str));

    }


    static int filterDigits(String s){
        char[] arr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])){
                sb.append(arr[i]);


            }
        }
        return Integer.parseInt(sb.toString());

    }
}
