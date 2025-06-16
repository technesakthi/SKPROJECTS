import java.util.*;
public class AddRandomno {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);
        System.out.println(num1 + num2);
    }
}
