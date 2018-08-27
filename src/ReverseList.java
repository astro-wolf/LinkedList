/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 *
 * Reverse a singly linked list.
 *
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 */

public class ReverseList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ReverseList reverseList = new ReverseList();
        reverseList.reverseList(listNode);
    }

    public ListNode reverseList(ListNode head) {
        ListNode currHead = head.next;
        while (currHead != null) {
            ListNode temp = currHead;
            currHead = currHead.next;
            temp.next = head;
            head = temp;
        }
        return head;
    }

}
