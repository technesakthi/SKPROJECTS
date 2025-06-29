package LinkedList;

public class Studentcls {
    public static class Student{
        String name;
        int rollno;
        int id;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Kumar";
        s1.rollno=1;
        s1.id=1;
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.id);
    }
}
