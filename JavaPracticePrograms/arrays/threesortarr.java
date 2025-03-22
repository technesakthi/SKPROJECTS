import java.util.*;
public class threesortarr {
    static boolean pre(int val,int arr[],int sz){
        boolean bo=false;
        for(int i=0;i<sz;i++){
            if(arr[i]==val) {
                bo=true;
            }
        }
        return bo;

    }
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int sz1=sk.nextInt();
        int arr1[]=new int[sz1];
        for(int i=0;i<sz1;i++) arr1[i]=sk.nextInt();
        int sz2=sk.nextInt();
        int arr2[]=new int[sz2];
        for(int i=0;i<sz2;i++) arr2[i]=sk.nextInt();
        int sz3=sk.nextInt();
        int arr3[]=new int[sz3];
        for(int i=0;i<sz3;i++) arr3[i]=sk.nextInt();
        for(int i=0;i<sz1;i++){
            if(pre(arr1[i],arr2,sz1)&&pre(arr1[i],arr3,sz1)){
                System.out.print(arr1[i]+" ");
            }
        }
        for(int i=0;i<sz2;i++){
            if(pre(arr2[i],arr1,sz2)&&pre(arr2[i],arr3,sz2)){
                System.out.print(arr2[i]+" ");
            }
        }
        for(int i=0;i<sz3-1;i++){
            if(pre(arr3[i],arr2,sz3)&&pre(arr3[i],arr1,sz3)){
                System.out.print(arr3[i]+" ");
            }
        }

    }
    
}
