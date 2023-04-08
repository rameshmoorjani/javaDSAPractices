package linkedlist;

import java.util.ArrayList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        Node2 A = new Node2(1);
        Node2 B = new Node2(2);
        Node2 C = new Node2(3);
        Node2 D = new Node2(4);

        A.next=B;
        B.next=C;
        C.next=D;

        Node2 head = A;
        Node2 current = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (current!=null)
        {

            list.add(current.val);
            current=current.next;
        }

        System.out.println("linked list is "+list);



        ArrayList<Integer> list2 = new ArrayList<>();
        recursiveList(head,list2);
        System.out.println("recursive list "+list2);

        System.out.println("recursive sum "+recursiveSum(head));

        ArrayList<Integer> list3 = new ArrayList<>();
        recursiveList(reverspractice(head),list3);
        System.out.println("reverted  list  "+list3);
    }

    static Node2 reverspractice(Node2 head)
    {
        Node2 current=head;
        Node2 next =null;
        Node2 prev= null;
        while(current!=null)
        {
            next =current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        return prev;
    }
    
    
    
    
    
    
    
    



















    static Node2 reverse(Node2 Node2)
    {
        Node2 prev = null;
        Node2 current = Node2;
        Node2 next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;

    }
    
    static void recursiveList(Node2 head,ArrayList<Integer> list)
    {
        if(head==null) return;
        System.out.println(head.val);
        list.add(head.val);
        recursiveList(head.next,list);
    }

    int sum=0;
    static int recursiveSum(Node2 head)
    {
        if(head==null) return 0;
        System.out.println(head.val);
        //list.add(head.val);
        return head.val+recursiveSum(head.next);
    }

}

 class Node2 {

    int val ;
    Node2 next;

    public Node2(int val)
    {
        this.val=val;
        this.next=null;
    }

}
