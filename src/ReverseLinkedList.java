import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReverseLinkedList {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("input value");
        boolean flag = true;
        ListNode linkNodeHead = null;
        ListNode LinkNodeTail = null;
        ListNode prev = null;

        while (flag) {
            String input1 = input.nextLine();
            System.out.println("character is  " + input1);
            ListNode node = new ListNode(input1);
            if (linkNodeHead == null) {
                linkNodeHead = node;
            } else {
                node.next = linkNodeHead;
                //linkNodeHead.next=node;
                linkNodeHead=node;
                //node.next=linkNodeHead;
            }
            if (input1.equals("end")) {
                flag = false;

            }

        }
        System.out.println("linked list "+linkNodeHead);
        //System.out.println("linked list " + reverseListRecursive(linkNodeHead));

        while(linkNodeHead!=null)
        {
            ListNode next_node = linkNodeHead.next;
            linkNodeHead.next=prev;
            prev=linkNodeHead;
            linkNodeHead=next_node;
        }
        System.out.println("revered link using iterator "+prev);

    }
        static ListNode reverseListRecursive(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        System.out.println("value is "+head.getVal());
        ListNode node = reverseListRecursive(head.next);
        head.next.setNext(head);
        head.setNext(null);
        System.out.println("value reverse2 is "+head.getVal());
        return node;
    }

    /*createLinkedList()2
    {
        LinkNode linkNode = new LinkNode(1);*/


    /*ListNode constructLinkedList() {
        ListNode head = null;
        ListNode tail = null;
        for (int i = 1; i <= 5; i++) {
            ListNode node = new ListNode(i);
            if (head == null) {
                head = node;
            } else {
                tail.setNext(node);
            }
            tail = node;
        }
        return head;
    }*/




}

 class ListNode
{

    String val;
    ListNode next;
    ListNode(String i)
    {
        this.val=i;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public String getVal() {
        return val;
    }


    @Override
    public String toString() {
        return "ListNode{" +
                "val='" + val + '\'' +
                ", next=" + next +
                '}';
    }
}