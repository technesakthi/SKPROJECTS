package Labsession;

public class LinkLis {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(8);
        Node e = new Node(10);
        Node f = new Node(13);
        Node g = new Node(15);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;


        while(a.next!=null){
            System.out.println(a.data+" ");
            a=a.next;
        }
        System.out.println(a.data);






    }
}


