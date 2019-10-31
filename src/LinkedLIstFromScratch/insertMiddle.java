package LinkedLIstFromScratch;

public class insertMiddle {
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
		
		// First create a linked list
		public void append(int value) {
			Node newNode = new Node(value);
			Node current = head;
			if(head == null) {
				head = newNode;
				return;
			}
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public void insert(int data, int pos) {
			Node newNode = new Node(data);
			Node current = head, temp = null;
			while(current.value != pos) {
				current = current.next;
			}
			temp = current.next;
			current.next = newNode;
			newNode.next = temp;
			
		}
		
		public void display(){
			Node current = head;
			while(current != null) {
				System.out.print(current.value+" ");
				current = current.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,4,5};
		for(int i  =0; i < arr.length; i++){
			llist.append(arr[i]);
		}
		llist.display();
		llist.insert(3, 2);
		llist.display();
	}
}
