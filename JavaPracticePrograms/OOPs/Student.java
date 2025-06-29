package OOPs;
public class Student {
    int rollno;
    String name;
    int age;

    public int GetRollno() {
        return rollno;
    }
    public void setRollno(int x) {
         rollno=x;
    }
    Student(int x,String y,int z) {
        System.out.println("Student constructor");
        rollno=x;
        name=y;
        age=z;
    }
    public void display(){
        System.out.println("Student display");
        System.out.println("rollno="+rollno);
        System.out.println("name="+name);
        System.out.println("age="+age);
        return;
    }


}

class StudentClass {
        public static void main(String[] args) {
            Student s1=new Student(1,"Srinath",2);
            s1.display();







        }
    }
