package JavaPracticePrograms.level2;
import java.util.*;
public class centernumpattern {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int n = sk.nextInt();
            for (int i = 0; i < n; i++,System.out.println()) {
                for (int j = 0; j < n; j++) {
                    if (i == j) 
                        System.out.print(i + 1);  
                    else 
                        System.out.print(n); 
                }
            }
    }
}
    

