package LinkedLIstFromScratch;

public class DeleteANode {
	static class Node{
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
			Node current = head;
			if(head == null){
				head = newNode;
			}
			if(current == null){
				current = newNode;
			}
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public void delete(int val) {
			Node current = head, prev = null;
			
			// if deleted node is head then
			if (current != null && current.value == val) {
				head = current.next;
				return;
			}
			
			// some where in after the head
			while (current != null && current.value != val) {
				prev = current;
				current = current.next;
			}
			
			// if val is not found
			if (current == null) return;
			
			prev.next = current.next;
		}
		/*
		void delete(int key)
		{
			// Store head node
			Node temp = head, prev = null;
			
			// If head node itself holds the key to be deleted
			if (temp != null && temp.value == key)
			{
				head = temp.next; // Changed head
				return;
			}
			
			// Search for the key to be deleted, keep track of the
			// previous node as we need to change temp.next
			while (temp != null && temp.value != key)
			{
				prev = temp;
				temp = temp.next;
			}
			
			// If key was not present in linked list
			if (temp == null) return;
			
			// Unlink the node from linked list
			prev.next = temp.next;
		}
		*/
		public void display() {
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
		for(int i = 0; i < arr.length; i++){
			llist.append(arr[i]);
		}
//		llist.display();
//		llist.delete(2);
//		llist.display();
//		llist.delete(1);
		llist.display();
		llist.delete(5);
		llist.display();
	}
}
