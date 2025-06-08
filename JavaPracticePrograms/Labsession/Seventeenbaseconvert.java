package Labsession;
import java.util.*;
//23GF -> 10980
public class Seventeenbaseconvert{
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String k=sk.nextLine();
        int ans=0,res=0,pow=0;
        int l=k.length();
        char ch;
        for(int i=l-1;i>=0;i--){
            ch=k.charAt(i);
            if(Character.isDigit(ch))
                ans = ch -'0';
            else if(ch>='A' && ch<='G') ans=ch -'A'+10;
            res +=ans* (int)Math.pow(17,pow); 
            pow++;
            
        }
        System.out.println(res);
    }

} 