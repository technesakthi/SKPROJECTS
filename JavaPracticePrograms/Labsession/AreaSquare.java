package Labsession;

import java.util.Scanner;

public class AreaSquare {
    static float areaofSquare(float l){
        if(l<0) return -1;
        return l*l;
    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        float n=sk.nextFloat();
        System.out.println(areaofSquare(n));
    }
}
