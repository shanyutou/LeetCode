/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        

        /**
         * 遍历节点，
         * 比较节点，并插入节点
         * 下一个节点比较
         */
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode top;
        ListNode now;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        
        if(temp1.val <= temp2.val){
            top = temp1;
            now = temp1;
            temp1 = temp1.next;
        }else{
            top = temp2;
            now = temp2;
            temp2 = temp2.next;
        }
        
        
        while(null != temp1 && null != temp2){
            if(temp1.val <= temp2.val){
                now.next = temp1;
                now = temp1;
                temp1 = temp1.next;

            }else{
                now.next = temp2;
                now = temp2;
                temp2 = temp2.next;
            }
        }

        if( temp1 != null && now != temp1){
            now.next = temp1;
        }
        if(temp2 != null && now != temp2) {
            now.next = temp2;
        }

        return top;
    }
}
// @lc code=end

