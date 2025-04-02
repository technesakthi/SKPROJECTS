package JavaPracticePrograms.level2;

import java.util.Scanner;

public class topdownstepcount {
    public static void main(String[] args) {
        Scanner sk= new Scanner(System.in);
        int steps = sk.nextInt();
        char direction = sk.next().charAt(0); 
        int x = 0,y=0;
        if (direction == 'T') {
            y += steps;  
        } else if (direction == 'B') {
            y -= steps;  
        }
        System.out.println("("+x+","+y+")");
    }
    
}
