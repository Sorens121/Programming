package LinkedList;

public class insertion2 {
	
	static class Node{
		int value;
		Node next;
		
		Node(int value) {
			this.value = value;
			next = null;
		}
	}
	
	static class LinkedList{
		Node head;
		
		public void push(int data){ // inserting at the beginning of the list
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
		
		public void pushMiddle(int data, int position){ // inserting after the given position
			Node newNode = new Node(data);
			Node current = head;
			while(current.value != position){
				current = current.next;
			}
			Node store_temp = current.next;
			current.next = newNode;
			newNode.next = store_temp;
		}
		
		public void pushAtEnd(int data){ // inserting at end of the list
			Node newNode = new Node(data);
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public void printList(){
			Node current = head;
			while(current != null){
				System.out.print(current.value+" ");
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,3,4};
		for(int i = 0;i < arr.length;i++){
			llist.push(arr[i]);
		}
		
		llist.printList();
		llist.pushMiddle(0,3);
		System.out.println();
		llist.printList();
		System.out.println();
		llist.pushAtEnd(5);
		llist.printList();
	}
}
