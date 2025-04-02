package JavaPracticePrograms.level2;

import java.util.Scanner;

public class Rightrotaten {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int num = sk.nextInt();
        int n = sk.nextInt();
        int temp = num, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        n = n % count; 
        
        int  pow= 1, i = 0;
        while (i < n) {
            pow *= 10;
            i++;
        }
        
        int right = num % pow;
        int left = num / pow;

        pow= 1; i = 0;
        while (i < count - n) {
            pow *= 10;
            i++;
        }
        
        int rot= right * pow + left;
        System.out.println(rot);
    
}
}