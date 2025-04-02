package JavaPracticePrograms.level2;
import java.util.*;
public class stepcountxy {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int steps = sk.nextInt(); 
        char direction = sk.next().charAt(0); 
        int x = 0,y=0;
        if (direction == 'R') 
            x+= steps;  
        else if (direction == 'L') 
            x-= steps; 
        

        System.out.println("(" + x + ","+y+")");
    }
}

    

