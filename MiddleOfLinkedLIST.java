// Given the head of a singly linked list, return the middle node of the linked list.

// If there are two middle nodes, return the second middle node.

 

// Example 1:


// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.
// Example 2:


// Input: head = [1,2,3,4,5,6]
// Output: [4,5,6]
// Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 

// explanation:
// Intuition
// To find the middle node of a linked list, you can use the fast pointer/slow pointer technique. Here's an algorithm to accomplish this:

// Approach
// Initialize two pointers, slowPtr and fastPtr, pointing to the head of the linked list.
// Move the fastPtr by two nodes and the slowPtr by one node in each iteration until the fastPtr reaches the end of the list.
// When the fastPtr reaches the end (i.e., fastPtr.next is null or fastPtr is null), the slowPtr will be pointing to the middle node of the list.
// Return the node pointed to by the slowPtr as the middle node.
// Complexity
// Time complexity: The time complexity is O(n)
// The time complexity of finding the middle of a linked list using the fast pointer/slow pointer technique is O(n), where n is the number of nodes in the linked list. This is because both the slow pointer and fast pointer traverse the list simultaneously, with the fast pointer moving at twice the speed of the slow pointer. In the worst case, the fast pointer will have to traverse the entire list before reaching the end, resulting in a linear time complexity.

// Space complexity: The space complexity is O(1)
The space complexity of this algorithm is O(1), which means it requires constant space. It only uses two pointers, regardless of the size of the linked list. Hence, the space required is independent of the input size.
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
    public ListNode middleNode(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;

        while(fp != null && fp.next !=null ){
            sp = sp.next;
            fp = fp.next.next;
        }
        return sp;
    }
}
