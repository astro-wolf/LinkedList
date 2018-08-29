/**
 * https://leetcode.com/problems/palindrome-linked-list/description/
 *
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 * Input: 1->2
 * Output: false
 *
 * Example 2:
 * Input: 1->2->2->1
 * Output: true
 *
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */
public class PalindromeList {

    public static void main(String[] args) {
        PalindromeList palindromeList = new PalindromeList();
        boolean palindrome = palindromeList.isPalindrome(new ListNode(1,
                new ListNode(2,
                        new ListNode(1/*,
                                new ListNode(1)*/))));
        System.out.println("v made eet");
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode palindromeNode = checkPalindrome(head, head);
        return palindromeNode != null && palindromeNode == head;
    }

    private ListNode checkPalindrome(ListNode actualHead, ListNode head) {
        if (head == null || head.next == null)
            return null;
        if (head.val == head.next.val) {
            if(head == actualHead && head.next.next == null)
                return head;//we got palindrome
            return head.next.next;
        }
        ListNode checkNode = checkPalindrome(actualHead, head.next);
        if (checkNode != null && head.val == checkNode.val) {
            if(head == actualHead)
                return head;//we got palindrome
            return checkNode.next;
        }
        return null;
    }

}
