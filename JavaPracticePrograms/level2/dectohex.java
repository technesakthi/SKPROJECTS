package JavaPracticePrograms.level2;

import java.util.Scanner;

public class dectohex {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int num = sk.nextInt(); 
        String hex = ""; 
        int remainder;
        if (num == 0) {
            hex = "0"; 
        } else {
            while (num > 0) {
                remainder = num % 16; 
                char hexChar = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + (remainder - 10));
                hex = hexChar + hex;
                num /= 16; 
            }
        }

        System.out.println(hex);
    
    }
    
}
