/**
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 *
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */
public class RemoveGivenValues {

    public static void main(String[] args) {
        RemoveGivenValues removeGivenValues = new RemoveGivenValues();
        ListNode head = removeGivenValues.removeElements(
                new ListNode(4,
                        new ListNode(4,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(6,
                                                        new ListNode(7,
                                                                new ListNode(4))))))),
                4
        );
        System.out.println("We ran");
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        while (head.val == val) {
            head = head.next;
            if (head == null)
                return null;
        }
        ListNode travNode = head;
        while (travNode != null && travNode.next != null) {
            if (travNode.next.val == val) {
                travNode.next = travNode.next.next;
            } else {
                travNode = travNode.next;
            }
        }
        return head;
    }

}
