package JavaPracticePrograms.level2;
import java.util.*;
public class diffbtwdates {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String time1= sk.nextLine();
        String arr1[] = new String[3];
        arr1= time1.split("/");
        int dd1 = Integer.parseInt(arr1[0]);
        int mm1= Integer.parseInt(arr1[1]);
        int yy1= Integer.parseInt(arr1[2]);
        String time2= sk.nextLine();
        String arr2[] = new String[3];
        arr2= time2.split("/");
        int dd2= Integer.parseInt(arr2[0]);
        int mm2= Integer.parseInt(arr2[1]);
        int yy2= Integer.parseInt(arr2[2]);
        if(dd1<0&&dd1>=31&&dd2<0&&dd2>=31&&mm1<0&&mm1>=12&&mm2<0&&mm2>=12) System.out.println("INVALID!!");
        int epd1=0;
        for(int i=mm1;i<=12;i++){
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
                epd1+=31;
            else if(i==4||i==6||i==9||i==11)    epd1+=30;
            else if((yy1 % 4 == 0) && (yy1% 100 != 0) || (yy1% 400 == 0)&&i==2)  epd1+=29;
            else  epd1+=28;    
        }
        epd1-=dd1;
        int epd2=0;
        for(int i=1;i<=mm2-1;i++){
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
                epd2+=31;
            else if(i==4||i==6||i==9||i==11)    epd2+=30;
            
            else if((yy2 % 4 == 0) && (yy2% 100 != 0) || (yy2% 400 == 0)&&i==2)  epd2+=29;
            else if(i==2) epd2+=28;    
        }
        epd2+=dd2;
        int totd=epd2+epd1;
        System.out.println(totd);
                

        

    }
    
}
