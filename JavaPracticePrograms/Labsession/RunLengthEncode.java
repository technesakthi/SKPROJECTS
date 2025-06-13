import java.util.*;
class RunLengthEncode {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String str=sk.nextLine();
        str=str.toUpperCase();
        StringBuilder ans=new StringBuilder();
        int c=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)) {
                c++;
                
            }
            else{
                if(c>1){
                ans.append(str.charAt(i-1));
                ans.append(c);
                }
                else {
                    ans.append(str.charAt(i-1));
                }
                c=1;

            }
        }
         if(c>1){
                ans.append(str.charAt(str.length()-1));
                ans.append(c);
                }
                else {
                    ans.append(str.charAt(str.length()-1));
                }
        System.out.println(ans.toString());

    }
    
    
}
