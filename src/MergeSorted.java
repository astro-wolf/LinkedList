/**
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */

public class MergeSorted {

    public static void main(String[] args) {
        MergeSorted mergeSorted = new MergeSorted();
        mergeSorted.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4, null))),
                new ListNode(1, new ListNode(3, new ListNode(4, null)))
        );
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null || l2 == null) return l1 == null ? l2 : l1;
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                res.next = l1;
                l1 = l1.next;
            } else {
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }
        if (l1 != null)
            res.next = l1;
        if (l2 != null)
            res.next = l2;
        return temp.next;
    }

}
