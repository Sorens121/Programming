package LinkedList;

public class findLoop {
	static class Node {
		int value;
		Node next;
		
		Node(int value) {
			this.value = value;
			next = null;
		}
	}
	
	static class LinkedList {
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
		
		public boolean findLoop(){
			Node fast = head, slow = head;
			while(slow != null && fast != null && fast.next != null){
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast){
					return true;
				}
			}
			return false;
		}
		
		public void printList() {
			Node current = head;
			while(current != null) {
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
		// adding loop to test
		llist.head.next.next.next.next = llist.head.next;
		boolean result = llist.findLoop();
		System.out.println(result);
	}
}
