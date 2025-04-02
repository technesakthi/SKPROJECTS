package JavaPracticePrograms.level2;

import java.util.Scanner;

public class personrectwalk {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int steps = sk.nextInt(); 
        int x = 0, y = 0; 
        int dist = 10; 
        int dir = 0; 

        for (int i = 1; i <= steps; i++) {
            if (dir == 0) { 
                x += dist;
            } else if (dir == 1) { 
                y -= dist;
            } else if (dir == 2) { 
                x -= dist;
            } else { 
                y += dist;
            }

            dist += 10; 
            dir = (dir + 1) % 4; 
        }
        System.out.println("("+x+","+y+")");
    }
    
}
