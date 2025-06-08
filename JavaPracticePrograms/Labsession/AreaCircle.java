package Labsession;

import java.util.Scanner;

public class AreaCircle {
    static float areaofCirc(float r){
        final float PI=3.14f;
        if(r<0) return -1;
        return PI*r*r;

    }

    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        float radius=sk.nextFloat();
        System.out.println(areaofCirc(radius));
    }

}
