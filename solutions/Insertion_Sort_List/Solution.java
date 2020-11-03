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
    
    ListNode sorted;
    public ListNode insertionSortList(ListNode head) {
        
        sorted=null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode next=temp.next;
			
			//insert the current node in sorted manner in the result list
            sortedInsertion(temp);
            temp=next;
        }
        head=sorted;
        
        return head;
        
    }
    
    public void sortedInsertion(ListNode node)
    {
		//if the current node value is greater than the head node value of sorted list or the sorted list is empty
        if(sorted==null || sorted.val>=node.val)
        {
            node.next=sorted;
            sorted=node;
        }
        
        else {
            ListNode temp=sorted;
			
			//find the node before which the current node should be inserted
            while(temp.next!=null && temp.next.val<node.val)
            {
                temp=temp.next;
            }
            
            node.next=temp.next;
            temp.next=node;
            
        }
    }
}