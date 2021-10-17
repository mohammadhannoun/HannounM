package linkedlist;

public class LLV2 {
	NodeV2 head; // A reference of the head node which is the first node in the list 
		public void insert(String data) {
			NodeV2 newNode = new NodeV2(); // Creating and constructing an object called (newNode)
			newNode.data = data; // Assigning data to the node 
			newNode.next = null; // Assigning the value of the address that this node carries
				if(head == null) { //checking whether this is the first node and we don't have a list. 
					head = newNode;
				} else {
					NodeV2 temp = head; // Creating a temporary node to traverse around the list
					while(temp.next != null) { // Traversing the list till the address of the next node is null
						temp = temp.next; // going to the next node 
					}
					temp.next = newNode; // adding the node to the end of the list
				}
		}
		public void showList() {
			NodeV2 n = head;
				while(n.next != null) {
					System.out.println(n.data);
					n = n.next;
				}
				System.out.println(n.data);
		}
}
