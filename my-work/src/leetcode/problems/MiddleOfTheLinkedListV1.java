package leetcode.problems;

public class MiddleOfTheLinkedListV1 {
	    public ListNode middleNode(ListNode head) {
	        if(head.next == null) return head;
	        int mid = (size(head) / 2);   
	            for(int i = 0; i < mid; i++){
	                head = head.next;
	            }
	        return head;
	    }
	    public int size (ListNode node){
	        int size = 0;
	            while(node != null){
	                size++;
	                node = node.next;
	            }
	        return size;
	    }
	}

