package JavaPracticePrograms.level2;

import java.util.Scanner;

public class elapsedtimesec {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String time1= sk.nextLine();
        String arr1[] = new String[3];
        arr1= time1.split(":");
        
        int hr1 = Integer.parseInt(arr1[0]);
        int m1 = Integer.parseInt(arr1[1]);
        int sec1 = Integer.parseInt(arr1[2]);
        String time2= sk.nextLine();
        String arr2[] = new String[3];
        arr2= time2.split(":");
        
        int hr2= Integer.parseInt(arr2[0]);
        int m2= Integer.parseInt(arr2[1]);
        int sec2 = Integer.parseInt(arr2[2]);
        if(hr1>=0 && hr1<=23 && m1>=0 &&m1<=59 && sec1>=0 &&sec1<=59 &&hr2>=0 && hr2<=23 && m2>=0 &&m2<=59 && sec2>=0 &&sec2<=59){
            int tot1=hr1*3600+m1*60+sec1;
            int tot2=hr2*3600+m2*60+sec2;
            int tot=0;
            if(tot1>tot2) tot=tot1-tot2;
            else tot=tot2-tot1;
            System.out.println(tot);
        }
        else System.out.println("Invalid");

        
    }
    
}
