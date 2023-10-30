public class code2 {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public static class linkedlist{
            static Node head=null;
            static Node tail=null;

            void insert(int value){
                Node temp=new Node(value);
                if(head==null){
                    head=temp;
                    tail=temp;
                }
                else {
                   tail.next=temp;
                   tail=temp;
                }
            }
        void Showll()
        {
            while(head!=null){
                System.out.print(head.data);
                System.out.print("->");
                head=head.next;
            }
        }

    }

    public static void main(String[] args) {
    linkedlist ll=new linkedlist();
         ll.insert(4);
         ll.insert(5);
         ll.insert(6);
         ll.Showll();
    }
}
