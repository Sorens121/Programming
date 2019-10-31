package LinkedLIstFromScratch;

public class FindMiddleNode {
	
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
		
		public int findMiddle(){
			Node prev = head, current = head;
			if(head == null){
				return -1;
			}
			while(current != null && current.next != null){
				current = current.next.next;
				prev = prev.next;
			}
			return prev.value;
		}
		
		public void display(){
			Node current = head;
			while(current != null){
				System.out.print(current.value+" ");
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,3,4,5,6};
		for(int i = 0; i < arr.length; i++){
			llist.append(arr[i]);
		}
		llist.display();
		int res = llist.findMiddle();
		System.out.println("Middle is: "+res);
	}
}
