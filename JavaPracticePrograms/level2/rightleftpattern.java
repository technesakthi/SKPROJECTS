package JavaPracticePrograms.level2;
import java.util.*;
public class rightleftpattern {
    public static void main(String[] args) {
    Scanner sk=new Scanner(System.in);
    int n=sk.nextInt();
    int temp=1;
    for(int row=1;row<=n;row++,System.out.println()){
     int r=1;
      for(int col=1;col<=n;col++){
        if(row%2!=0){
          System.out.printf("%02d",temp);
          System.out.print(" ");
          temp++;
        }
        else{
          int v=(temp+n)-r;
          System.out.printf("%02d",v);
          System.out.print(" ");
          temp++;
          r+=2;
    }
  } 

}
    }
}