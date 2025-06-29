package OOPs;

interface Cars{
    public void start();
    public void charge();
}
class Tesla implements Cars{
    public void start(){
        System.out.println("Starting...");

    }
    public void charge(){
        System.out.println("charging...");
    }

}
public class implementinterfaces {
    public static void main(String[] args) {
        Tesla t1 = new Tesla();
        t1.start();
        t1.charge();


    }
}
