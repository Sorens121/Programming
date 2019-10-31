package LinkedList;

public class findLengthOfList {
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
		
		public void push(int data){
			Node newNode = new Node(data);
			if(head == null){
				head = newNode;
			}else{
				newNode.next = head;
				head = newNode;
			}
		}
		
		// finding length recursively
		public int getLengthRec(Node head){
			if(head == null){
				return 0;
			}
			return 1 + getLengthRec(head.next);
		}
		public int getLength(){
			return getLengthRec(head);
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
		int[] arr = {1,2,3,4};
		for(int i = 0;i < arr.length;i++){
			llist.push(arr[i]);
		}
		
		llist.printList();
		System.out.println("Length of the List is: "+llist.getLength());
	}
}
