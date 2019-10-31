package LinkedLIstFromScratch;

public class SearchElementIterative {
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
		
		public void append(int value) {
			Node current = head;
			Node newNode = new Node(value);
			if(head == null){
				head = newNode;
			}
			if(current == null){
				current = newNode;
			}
			
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public boolean search(int val){
			Node current = head;
			if(head == null){
				return false;
			}
			while(current != null){
				if(current.value == val){
					return true;
				}
				current = current.next;
			}
			return false;
		}
		
		public void display(){
			Node current = head;
			while(current != null){
				System.out.print(current.value+" ");
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,3,4};
		for(int i = 0; i < arr.length; i++){
			llist.append(arr[i]);
		}
		
		llist.display();
		boolean res = llist.search(1);
		System.out.println(res);
	}
}
