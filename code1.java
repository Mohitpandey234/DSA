public class code1 {
    public static void Display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static class Node{
        int data; //value
        Node next; //address of next node
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) {
           Node a=new Node(5);
           Node b=new Node(10);
           Node c=new Node(15);
           Node d=new Node(20);
           Node e=new Node(25);
           Node f=new Node(30);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Display(a);
        
    }
}
