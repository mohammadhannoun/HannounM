package leetcode.problems;

public class MiddleOfTheLinkedListV3 {
	 public ListNode middleNode(ListNode head) {
	 ListNode slow = head;
     ListNode fast = head;
     ListNode tmp = head;
	 int cntr = 0;
	 	while(tmp != null){
        cntr++;
        tmp = tmp.next;
        }
	 	while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
	 	}
        if((cntr % 2) == 0){
		    return slow.next;
	   }
        return slow;
		    }    
}
