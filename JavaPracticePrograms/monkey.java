//    1 2 3 4 5 i
//  1 0 0 0 0 0
//  2 0 1 0 1 0
//  3 0 1 1 1 0
//  4 0 1 1 0 0
//  5 0 1 1 0 1 
//  j
import java.util.*;

public class monkey {
        public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int n = sk.nextInt();
        boolean door[]=new boolean[n+1];
        for(int i=1 ; i<=n ;i++){
            for(int j=1;j<=n;j++){
                if(j%i==0){
                door[j]=!door[j];
                }

            }
        }
        int op= 0;
        for (int i = 1; i <= n; i++) {
            if (door[i]) {
                op++;
              }
            }
        System.out.println(op);

    }
}

       
       
