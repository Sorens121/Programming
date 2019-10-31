package LinkedList;

public class deleteNode {
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
		
		public void delete(int key){
			Node prev = null, current = head;
			// base case
			if(current == null){
				return;
			}
			// if head is the key
			if(current != null && current.value == key){
				head = current.next;
				return;
			}
			
			// if key is between start and end node
			while(current != null && current.value != key){
				prev = current;
				current = current.next;
			}
			prev.next = current.next;
			current.next = null;
		}
		
		public void printList() {
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
		int[] arr = {1,2,3,4,5,6};
		for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.printList();
		llist.delete(6);
		llist.printList();
		llist.delete(1);
		llist.printList();
		llist.delete(4);
		llist.printList();
	}
}
