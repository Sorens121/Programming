package LinkedLIstFromScratch;

public class FindLengthIterative {
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
		
		public void append(int value){
			Node newNode = new Node(value);
			Node current = head;
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
		
		public int findLength(){
			Node current = head;
			int count = 0;
			while(current != null){
				count++;
				current = current.next;
			}
			
			return count;
		}
		public void display() {
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
		System.out.println("Length of the list is: "+llist.findLength());
		llist.display();
	}
}
