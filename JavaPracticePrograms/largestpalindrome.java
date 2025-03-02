import java.util.*;
public class largestpalindrome {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        while (true) { 
            int or=num,rev=0,re=0,temp=num;
            while(temp!=0){
                re=temp%10;
                rev=rev*10+re;
                temp/=10;
            }
            if(or==rev){
                System.out.println(num);
                break;
            }
            num++;

            
        }
        
        
            
        
        
    }
    
}
