package Labsession;

import java.util.Scanner;

public class VolumeCube {
    static float volumeofCube(float l){
        if(l<0) return -1;
        return l*l*l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        System.out.println(volumeofCube(n));
    }
}
