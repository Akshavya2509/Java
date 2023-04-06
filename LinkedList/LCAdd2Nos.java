/*You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros. 

*/

package LinkedList;
import java.util.*;

// Main Class
class S1 {

    // Linked list implementation
    class ListNode{

        int val;

        ListNode next;

        ListNode(int val)
        {
            this.val = val;

            next = null;
        }

    }

    ListNode head;

    //Insertion at the end
    public void insert(int val)
    {
        ListNode n = new ListNode(val);

        if(head == null)
        {
            head = n;
            return;
        }

        ListNode temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = n;
    }
    
    // Reversal
    public void reverse()
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt;

        while(curr != null)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        head = prev;
    }

    // Function to add two numbers and then store inside a linked list
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {

        ListNode l1 = head1;
        ListNode l2 = head2;

        // LinkedList 3
        ListNode head3 = new ListNode(0);
        
        //Base cases
        if(head1 == null && head2 == null)
        {
            return null;
        }

        else if(head1 == null)
        {
            return head2;
        }

        else if(head2 == null)
        {
            return head1;
        }
        
        // Integers to store the two integers
        long l11 = 0, l22 = 0;
        
        // Creating the integers from given linked lists
        while(l1 != null || l2 != null)
        {
            if(l1 != null)
            {
                l11 = (l11 + l1.val) * 10;
                l1 = l1.next;
            }
            
            if(l2 != null)
            {
                l22 = (l22 + l2.val) * 10;
                l2 = l2.next;
            }
        }

        //Divided by 10 since if list was 1->2, by the above loop it will become 120 as its multiplied by 10 on every step
        l11 = l11 / 10;
        l22 = l22 / 10;
        
        // Making the Integer to be stored and printed
        long l33 = l11 + l22;
        
        // Pointer
        ListNode curr = head3;
        
        int r = 0;
        
        // Loop to put the values one by one inside the list
        while(l33 != 0)
        {
            if(curr == head3)
            {
                r = (int)l33 % 10;
                head3.val = r;
                l33 = l33 / 10;
            }

            else
            {
                r = (int)l33 % 10;
                curr.val = r;
                l33 = l33 / 10;
            }

            if(l33 == 0)
            {
                curr.next = null;
                break;
            }
            
            // Adding a node 
            curr.next = new ListNode(0);
            curr = curr.next;
        }
        
        return head3;
    }

    // Printing the linked list
    public void print(ListNode head)
    {
        ListNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[])
    {
        // Linked List 1
        S1 l1 = new S1();

        l1.insert(9);

        // reversed since the digits are stored in reverse order
        l1.reverse();

        // Linked List 3
        S1 l2 = new S1();

        l2.insert(1);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);

        // reversed since the digits are stored in reverse order
        l2.reverse();

        // Final Linked List
        S1 l3 = new S1();

        ListNode temp = l3.addTwoNumbers(l1.head, l2.head);

        l3.print(temp);
    }
}

/* 
 * Error input
 * [9]
 * [1,9,9,9,9,9,9,9,9,9]
 * 
 * Correct Output
 * [0,0,0,0,0,0,0,0,0,0,1]
 * 
 * My Output
 * [8,0,0,0,0,0,0,0,0,0,1]
 */