import java.util.*;
public class RTCProfitLoss {
    static int Profloss(int dis,int pass){
        int fuelprice=70;
        int mile=10;
        int ticketprice=80;
        int fuelcost=(dis/mile)*fuelprice;
        int revenue=pass*ticketprice;
        int prof=revenue-fuelcost;
        if(prof>=0){
            return -1;
        }
        return prof;
    }
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int distance=sk.nextInt();
        int passengers=sk.nextInt();
        System.out.println(Profloss(distance,passengers));
    }
    
}
