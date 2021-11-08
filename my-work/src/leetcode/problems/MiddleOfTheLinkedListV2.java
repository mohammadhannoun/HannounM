package leetcode.problems;

public class MiddleOfTheLinkedListV2 {
	public ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        int cntr = 1;
            while(cntr < size(head)){
                head = head.next;
                cntr++;
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
