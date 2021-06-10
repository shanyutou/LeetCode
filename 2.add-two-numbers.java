/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int first = 0;
        ListNode firstNode = l1;
        int firstIndex = 1;
        while(firstNode != null){
            first = firstNode.val * firstIndex + first;
            firstNode = firstNode.next;
            firstIndex = firstIndex * 10;
        }

        int second = 0;
        ListNode secondNode = l1;
        int secondIndex = 1;
        while(secondNode != null){
            second = secondNode.val * secondIndex + second;
            secondNode = secondNode.next;
            secondIndex = secondIndex * 10;
        }

        int resultInt = first + second;

        int index = 10;

        ListNode listNode = new ListNode(resultInt % index);
        while(resultInt / index > 0){
            int val = resultInt / index % 10;
            listNode = new ListNode(val, listNode);
        }

        return listNode;

    }
}
// @lc code=end

