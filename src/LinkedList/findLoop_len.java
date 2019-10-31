package LinkedList;

public class findLoop_len {
	static class Node {
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
			next = null;
		}
	}
	
	static class LinkedList{
		Node head;
		
		public void append(int data){
			Node newNode = new Node(data);
			if(head == null){
				head = newNode;
			}
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public int counter(Node head){
			Node current = head;
			int count = 1;
			while(current.next != head){
				count++;
				current = current.next;
			}
			return count;
		}
		
		public int findLoop(Node head) {
			Node slow_ptr = head, fast_ptr = head;
			while(slow_ptr != null && fast_ptr != null && fast_ptr.next != null){
				slow_ptr = slow_ptr.next;
				fast_ptr = fast_ptr.next.next;
				if(slow_ptr == fast_ptr){
					return counter(slow_ptr);
				}
			}
			return 0;
		}
		
		public void printList(){
			Node current = head;
			while(current != null){
				System.out.print(current.value+" ");
				current = current.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,3,4};
		for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.printList();
		// adding a loop
		llist.head.next.next.next.next = llist.head.next.next;
		int result = llist.findLoop(llist.head);
		System.out.println(result);
	}
}
