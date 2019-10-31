package LinkedLIstFromScratch;

public class DeleteAtPosition {
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
			Node current = head;
			if(head == null){
				head = newNode;
				return;
			}
			
//			if(current == null){
//				current = newNode;
//			}
			
			while(current.next!= null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public void delete(int pos) {
			Node current = head, prev = null;
			int count = 1;
			if(current != null && pos == 1){
				head = current.next;
				return;
			}
			while(current != null && count != pos){
				count++;
				prev = current;
				current = current.next;
			}
			if(current == null) return;
			prev.next = current.next;
		}
		
		public void display(){
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
		int[] arr = {1,2,3,4};
		for(int i  =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.display();
		llist.delete(1);
		llist.display();
		llist.delete(4);
		llist.display();
	}
}
