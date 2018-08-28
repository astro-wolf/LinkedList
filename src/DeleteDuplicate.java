/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 *
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */
public class DeleteDuplicate {

    public static void main(String[] args) {
        DeleteDuplicate deleteDuplicate = new DeleteDuplicate();
        deleteDuplicate.deleteDuplicates(new ListNode(1,
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(3,
                                        new ListNode(3, null))))));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode resHead = head;
        while (head.next != null) {
            if (head.val == head.next.val)
                head.next = head.next.next;
            else
                head = head.next;
        }
        return resHead;
    }

}
