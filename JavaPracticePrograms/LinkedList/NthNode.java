package LinkedList;

public class NthNode {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static int Length(Node head){
        Node temp=head;
        int sz=0;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        return sz;
    }
    static int Nth(Node head,int n,int m){
        Node temp=head;
        int k=n-m+1;
        for(int j=1;j<k;j++){
            temp=temp.next;

        }
        return temp.data;
    }
    static int fastslow(Node head,int m){
        Node fast=head;
        Node slow=head;
        for(int j=1;j<=m;j++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;

    }



    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(5);
        Node d=new Node(6);
        Node e=new Node(10);
        Node f=new Node(5);
        Node g=new Node(4);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        System.out.println(Nth(a,7,2));
        System.out.println();
    }
}
