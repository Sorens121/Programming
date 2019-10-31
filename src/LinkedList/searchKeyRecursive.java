package LinkedList;

public class searchKeyRecursive {
	static class Node {
		int value;
		Node next;
		
		Node(int value){
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
		
		// searching recursively
		public boolean searchKey(Node head, int key){
			// base case
			if(head == null)
				return false;
			if(head.value == key)
				return true;
			return searchKey(head.next,key);
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
		int[] arr = { 1,2,3,4,5,6};
		for(int i = 0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.printList();
		//boolean result = llist.searchKey(llist.head,4);
		boolean result = llist.searchKey(llist.head,6);
		if(result)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
