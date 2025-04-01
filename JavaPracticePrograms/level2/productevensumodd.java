package JavaPracticePrograms.level2;
import java.util.Scanner;
public class productevensumodd {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String time1= sk.nextLine();
        String arr1[] = new String[3];
        arr1= time1.split("/");
        int dd = Integer.parseInt(arr1[0]);
        int mm= Integer.parseInt(arr1[1]);
        int yy= Integer.parseInt(arr1[2]);
        if(mm<0) System.out.println("Invalid");
        int epd=0;
        for(int i=1;i<=mm;i++){
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                epd+=31;
            }
            else if(i==4||i==6||i==9||i==11){
                epd+=30;
            }
            if((yy % 4 == 0) && (yy% 100 != 0) || (yy% 400 == 0)) {
                epd+=29;

            }
            else epd+=28;
        }
        epd-=dd;
        System.out.println(epd);
    }
    
}
