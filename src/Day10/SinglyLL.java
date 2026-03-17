package Day10;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL {
    static Node head=null;
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void addAtPosition(int data,int position){
        Node newNode=new Node(data);
        if(position==1){
            addFirst(data);
            return;
        }
        Node curr=head;
        for(int i=1;i<position-1&& curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    public int countNodes(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public boolean isCyclic(){
        Node slow=head;//Tortoise
        Node fast=head;//Hare
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public int findMiddle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;//Shifting the Head
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deletePosition(int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(position<=0){
            System.out.println("Invalid positon");
            return;
        }
        if(position==1){
            deleteFirst();
            return;
        }
        Node temp=head;
        for(int i=1;i<position-1 && temp!=null;i++)
        {
            temp=temp.next;
        }
        if(temp!=null && temp.next!=null){
            temp.next=temp.next.next;
        }
    }
   public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ->");
            curr=curr.next;
        }
       System.out.println("null");
       System.out.println();
   }
    public static void main(String[] args) {
     SinglyLL list=new SinglyLL();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
        list.addFirst(60);
        list.display();
        list.addAtPosition(70,5);
        list.display();
        System.out.println("Thala for a Reason-> "+list.countNodes());
        list.reverse();
        list.display();
        //manual cycle creation
        //list.head.next.next.next.next.next.next.next=list.head.next;
        System.out.println("Cycle Detected ->"+list.isCyclic());
        System.out.println("Middle Element ->"+list.findMiddle());
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deletePosition(3);
        list.display();
    }
}
