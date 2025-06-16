package Labsession;
import java.util.*;
public class SquaresCubetillN {
    public static void main(String[] args) {


        Scanner sk = new Scanner(System.in);
        int n = sk.nextInt();
        int i = 1;
        System.out.print("The Squares of Natural Numbers: ");
        while (i <= n) {
            System.out.print(i*i+" ");
            i++;

        }
        i=1;
        System.out.println();
        System.out.print("The Cubes of Natural Numbers: ");
        while (i <= n) {
            System.out.print(i*i*i+" ");
            i++;

        }

    }
}
