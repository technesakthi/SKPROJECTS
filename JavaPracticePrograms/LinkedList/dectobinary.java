package LinkedList;

import java.util.Stack;
import java.util.*;
public class dectobinary {
    static void dectobinary(int n){
        int bin[]=new int[35];
        int i=0;
        while(n>0){
            bin[i]=n%2;
            n=n/2;
            i++;

        }
        for(int j=i-1;j>=0;j--){
            System.out.print(bin[j]);
        }
    }




    static void dectobin(int n) {
        Stack<Integer> st = new Stack<>();
        while (n > 0) {
            st.push(n % 2);
            n /= 2;

        }
        while (!(st.isEmpty())) {
            System.out.print(st.pop());
        }
    }

    public static void main(String[] args) {
        int num=10;
        dectobin(num);
        System.out.println();
        dectobinary(num);
        System.out.println();

        int k=Integer.parseInt(Integer.toBinaryString(num));
        System.out.println(k);
    }
}
