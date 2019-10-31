package LinkedList;

public class getNthFromEnd {
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
		
		public int getLength(){
			Node current = head;
			int len = 0;
			while(current != null){
				current = current.next;
				len++;
			}
			return len;
		}
		
		public int findNth(int pos){
			int length = getLength();
			int position = length - pos +1;
			Node current = head;
			int counter = 1;
			while(current != null){
				if(counter == position){
					return current.value;
				}
				current = current.next;
				counter++;
			}
			assert(false);
			return 0;
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
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0;i < arr.length;i++){
			llist.push(arr[i]);
		}
		
		llist.printList();
		System.out.println("Element is "+llist.findNth(5));
	}
}
