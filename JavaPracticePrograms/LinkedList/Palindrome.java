package LinkedList;

public class Palindrome {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static void Reverse(Node head){

    }
    static void Display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }

    }

    public static void main(String[] args) {

        Node a=new Node(7);
        Node b=new Node(9);
        Node c=new Node(2);
        Node d=new Node(5);
        Node e=new Node(3);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Display(a);
        Reverse(a);


    }
}
