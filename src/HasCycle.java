/**
 * https://leetcode.com/problems/linked-list-cycle/description/
 *
 * Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */
public class HasCycle {

    public static void main(String[] args) {
        HasCycle hasCycle = new HasCycle();
        hasCycle.hasCycle(new ListNode(1, new ListNode(2, null)));
    }

    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode fastHead = head;
        while (fastHead != null && fastHead.next != null) {
            head = head.next;
            fastHead = fastHead.next.next;
            if(head == fastHead)
                return true;
        }
        return false;
    }

}
