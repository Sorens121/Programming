package LinkedLIstFromScratch;

public class LinkedListBasic {
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
		
		
		public void display() {
			Node current = head;
			while(current != null) {
				System.out.println(current.value+" ");
				current = current.next;
			}
		}
		
		
		public static void main(String[] args) {
			LinkedList llist = new LinkedList();
			llist.head = new Node(1);
			llist.head.next = new Node(2);
			llist.head.next.next = new Node(3);
			
			llist.display();
		}
	}
}
