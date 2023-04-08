public class MergeTwoLinkedList {

    // Driver code
    public static void main(String[] args)
    {
        ListNode1 head1 = new ListNode1(1);
        head1.next = new ListNode1(3);
        head1.next.next = new ListNode1(5);

        // 1->3->5 LinkedList created
        ListNode1 head2 = new ListNode1(5);
        head2.next = new ListNode1(6);
        head2.next.next = new ListNode1(7);

        // 0->2->4 LinkedList created
        ListNode1 mergedhead = new GFG1().mergeTwoLists(head1, head2);

        new GFG1().printList(mergedhead);
    }
}

  class ListNode1 {

    int val;
    ListNode1 next;

    ListNode1() {}
    ListNode1(int val) { this.val = val; }

    ListNode1(int val, ListNode1 next)
    {
        this.val = val;
        this.next = next;
    }
}

class GFG1 {
    public ListNode1 mergeTwoLists(ListNode1 l1,
                                   ListNode1 l2)
    {
        // New List
        ListNode1 result = new ListNode1(-1);

        // variable to point the last node of the list.
        ListNode1 p = result;

        // Iterate the loop
        while (l1 != null && l2 != null) {
            // Find the smaller element and append it to the
            // list.
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            }

            else {
                p.next = l2;
                l2 = l2.next;
            }

            // Update the variable
            p = p.next;
        }

        // If anyone list become empty append the remaining
        // list element of othe list.
        if (l1 == null) {
            p.next = l2;
        }

        else if (l2 == null) {
            p.next = l1;
        }

        // Return the resultant list without first extra
        // node
        return result.next;
    }

    // A utility function to print linked list
    void printList(ListNode1 node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }


}
