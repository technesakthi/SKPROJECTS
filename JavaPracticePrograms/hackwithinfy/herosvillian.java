package JavaPracticePrograms.hackwithinfy;
import java.util.*;
public class herosvillian {
    public static void main(String[] args) {
        Scanner sk=new Scanner (System.in);
        int n=sk.nextInt();//no. of villians
        int m=sk.nextInt();//no. of heros
        int hero[]=new int[m];
        int vil[]=new int[n];
        int H=sk.nextInt();//health of heros
        for(int i=0;i<m;i++) hero[i]=H;
        for (int i=0;i<n;i++){
            vil[i]=sk.nextInt();
        }
        int h=0;
        for(int i=0;i<n;i++){
            while(vil[i]!=0){
                if(hero[h]>vil[i]){
                    vil[i]*=0;
                    hero[h]-=vil[i];
                    break;
                }
                else if(hero[h]<vil[i]){
                    hero[h]*=0;
                    h++;
                    break;
    
                }
                else if(vil[i]==hero[h]){
                    vil[i]*=0;
                    hero[h]*=0;
                    h++;
                    break;
                }


        }
       
        
        }
        boolean flag=false;
        for(int i=0;i<n;i++) {
            if(vil[i]==0) flag=true;

        }

}
    

