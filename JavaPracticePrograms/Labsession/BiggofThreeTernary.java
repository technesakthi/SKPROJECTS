package Labsession;
import java.util.*;
public class BiggofThreeTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println(max);
    }
}
