package LinkedList;

import java.security.PrivilegedExceptionAction;

public class LL {
    private Node head;
    private Node tail;
    private int size;
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
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

//    ye part samajhna padega firse

    public void insertRec(int val, int index){
        head=insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(val==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index--,node.next);
        return node;
    }


    // questions
    public void dupilcates(){
        Node node = head;
        while (node.next!=null){
            if (node.next.val==node.val){
                node.next=node.next.next;
                size--;
            }else {
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    public static LL merge(LL first, LL second){
        LL ans =new LL();

        Node f= first.head;
        Node s= second.head;

        while(f!=null && s!= null){
            if (f.val<s.val){
                ans.insertLast(f.val);
                f=f.next;
            }else{
                ans.insertLast(s.val);
                s=s.next;
            }
        }
        while (f!=null){
            ans.insertLast(f.val);
            f=f.next;
        }
        while (s!=null){
            ans.insertLast(f.val);
            s=s.next;
        }
        return ans;
    }

    public boolean cycle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }

    public int cycleLen(Node head) {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                // cal length
                int len=0;
                Node temp=slow;
                do{
                   temp=temp.next;
                   len++;
                }while (temp!=slow);
                return len;
            }
        }
        return 0;
    }

    public Node detectCycle(Node head) {
        Node slow=head;
        Node fast=head;
        int length =0;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                length=cycleLen(slow);
                break;
            }
        }
        if (length==0){
            return null;
        }
        // find start
        Node f= head;
        Node s=head;
        while(length>0){
            s=s.next;
            length--;
        }
        //move both ahead. i.e f and s and they will meet at start
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;   // can return any of the ones
    }

    public boolean isHappy(int n){
        int slow=n;
        int fast=n;

        do {
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while (fast!=slow);

        if (slow==1){
            return true;
        }
        return false;
    }
    private int findSquare(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num=num/10;
        }
        return ans;
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
