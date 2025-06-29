package OOPs;

class Animal {
    int leg=4;
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class dog  extends Animal {
    boolean bark=true;


}
class cat extends Animal {
    boolean bark=false;
}
class Main{
    public static void main(String[] args) {
        dog a=new dog();
        a.eat();
        a.sleep();
        System.out.println(a.bark);
    }
}
