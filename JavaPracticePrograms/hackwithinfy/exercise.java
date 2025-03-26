package JavaPracticePrograms.hackwithinfy;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int E=sk.nextInt();
        int N=sk.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sk.nextInt();
        }
        int c=0;
        boolean flag=false;
        for(int i=0;i<N;i++){
            for(int j=1;j<=2;j++){
                E-=A[i];
                c++;
                if(E<0){
                    flag=true;
                    c=1;
                }
                
                
            } 
        }
        if(E<0||flag) System.out.println(c);
        else if(E==0) System.out.println(c);
        else System.out.println(-1);


        

    }
    
}
