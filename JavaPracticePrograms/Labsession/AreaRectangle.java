package Labsession;

import java.util.Scanner;

public class AreaRectangle {
    static float areaRect(float l,float b){
        if(l<0||b<0) return -1;
        return l*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float m = sc.nextFloat();
        System.out.println(areaRect(n,m));


    }
}
