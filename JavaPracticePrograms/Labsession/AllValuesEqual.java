package Labsession;
import java.util.*;
public class AllValuesEqual {
    static int[] makeAllValuesEqual(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        int op = 0;
        for (int i = 0; i < a.length; i++) {
            op += Math.abs(a[i] - min);
        }

        return new int[]{min,op};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[]=makeAllValuesEqual(arr);
        System.out.println("Min Value: "+ans[0]);
        System.out.println("Operations Done "+ans[1]);
    }
}
