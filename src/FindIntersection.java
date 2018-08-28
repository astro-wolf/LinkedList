/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 *
 * For example, the following two linked lists:
 *
 *    A:       a1 → a2
 *                    ↘
 *                       c1 → c2 → c3
 *                    ↗
 *    B: b1 → b2 → b3
 * begin to intersect at node c1.
 *
 *
 * Notes:
 *
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class FindIntersection {

    public static void main(String[] args) {
        FindIntersection findIntersection = new FindIntersection();
        ListNode fourNode = new ListNode(4, new ListNode(5, new ListNode(6, null)));
        ListNode nodeOne = new ListNode(1, new ListNode(2, fourNode));
        ListNode nodeTwo = new ListNode(1, new ListNode(2, new ListNode(3, fourNode)));
        ListNode resNode = findIntersection.getIntersectionNode(nodeOne, nodeTwo);
        System.out.println("Wow, it ran  :P");
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode headOne = headA, headTwo = headB;
        int l1 = 0, l2 = 0;
        while (headOne != null) {
            l1++;
            headOne = headOne.next;
        }
        while (headTwo != null) {
            l2++;
            headTwo = headTwo.next;
        }
        //headOne and headTwo are now useless
        int diff = Math.abs(l1 - l2);
        if(diff == 0)
            return mGetIntersectionNode(headA, headB);
        else if (l1 > l2) {
            while (diff > 0) {
                headA = headA.next;
                diff--;
            }
            return mGetIntersectionNode(headA, headB);
        } else {
            while (diff > 0) {
                headB = headB.next;
                diff--;
            }
            return mGetIntersectionNode(headA, headB);
        }
    }

    private ListNode mGetIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null && headB != null) {
            if(headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

}
