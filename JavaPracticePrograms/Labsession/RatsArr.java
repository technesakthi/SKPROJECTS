package Labsession;

import java.util.Scanner;
public class RatsArr {
    static int foodconsume(int food[],int target){
        int n=0,c=0;

        for(int i=0;i<food.length;i++){
            n+=food[i];
            c++;
            if(n>=target) return c;

        }
        return 0;
    }




    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int house=sk.nextInt();
        int food[]=new int[house];
        for(int a=0;a<house;a++){
            food[a]=sk.nextInt();

        }
        int rat=sk.nextInt();
        int ffr=sk.nextInt();
        int tot=rat*ffr;
        System.out.println(foodconsume(food,tot));


    }
}
