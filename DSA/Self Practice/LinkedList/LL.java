package LinkedList;

import java.security.PrivilegedExceptionAction;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }
    public int deleteFirst(){
        int val= head.val;
        head=head.next;
        size--;
        if (head==null){
            head=tail;
        }
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    public void insert(int val , int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }

        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;


    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }

        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void display(){
        Node temp = head ;
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node{

        private int val;
        private Node next;

        private Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        private Node(int val) {
            this.val = val;
        }
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertLast(99);
        list.insert(100,3);
        System.out.println(list.deleteFirst());
        list.display();

    }
}
