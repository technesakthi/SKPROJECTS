package Labsession;
import java.util.Scanner;
public class EntryExit {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int T=sk.nextInt();
        int entry[]=new int[T];
        int exit[]=new int[T];
        for(int i=0;i<T;i++){
            entry[i]=sk.nextInt();
            exit[i]=sk.nextInt();
        }
        int max=0;
        int present=0;
        for(int i=0;i<T;i++){
            present+=(entry[i]-exit[i]);
            if(present>max){
                max=present;
            }
        }
        System.out.println(max);
    }
}
