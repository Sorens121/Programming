package LinkedList;

public class insertion1 {
	static class Node{
		int value;
		Node next;
		
		Node(int value){ // constructor
			this.value = value;
			next = null;
		}
	}
	
	static class LinkedList {
		Node head;
		
		public void display() {
			Node current = head;
			while(current != null){
				System.out.print(current.value+" ");
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
		
		llist.display();
	}
}
