package LinkedLIstFromScratch;

public class insertAtEnd {
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
		
		public void append(int value) {
			Node newNode = new Node(value);
			if(head == null) {
				head = newNode;
				return;
			}
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
			
		}
		
		public void display() {
			Node current = head;
			while(current != null) {
				System.out.print(current.value+" ");
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,3,4};
		for(int i = 0; i< arr.length; i++){
			llist.append(arr[i]);
		}
		
		llist.display();
	}
}
