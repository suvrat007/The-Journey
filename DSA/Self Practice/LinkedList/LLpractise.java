package LinkedList;
public class LLpractise {
    private Node head;
    private Node tail;
    private int size;

    public LLpractise() {    // dont understand this bit
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;
        private Node(int val) {
            this.val = val;
        }
        private Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if (tail==null){
            head=tail;
        }
        size++;
    }
    public void insertLast(int val){
        if (tail==null){
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next=node;
        node=tail;
        size++;

    }
    public void displayLL(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

}