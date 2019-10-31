package LinkedLIstFromScratch;

public class SearchElementRecursive {
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
			Node current = head;
			Node newNode = new Node(value);
			if(head == null){
				head = newNode;
			}
			if(current == null){
				current = head;
			}
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public boolean search(Node temp, int val){
			if(temp == null){
				return false;
			}
			if(temp.value == val){
				return true;
			} else{
				return search(temp.next, val);
			}
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
		int[] arr = {1,2,3,4,5};
		for(int i  =0; i < arr.length; i++){
			llist.append(arr[i]);
		}
		llist.display();
		boolean res = llist.search(llist.head, 6);
		System.out.println(res);
	}
}
