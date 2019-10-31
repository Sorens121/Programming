package LinkedLIstFromScratch;

public class FindNthNodeFromEnd {
	static class Node {
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
			next = null;
		}
	}
	
	static class LinkedList{
		Node head;
		
		public void append(int value) {
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
		// Method 1
		public int getLength(){
			Node current = head;
			int count = 0;
			while(current != null){
				count++;
				current = current.next;
			}
			return count;
		}
		
		public int getNode(int index){
			Node current = head;
			int len = getLength();
			int newIndex = len - index;
			int count = 1;
			if(len < index){
				return 0;
			}
			
			if(head == null){
				return 0;
			}
			
			while(current != null) {
				if (count == len) {
					return current.value;
				}
				count++;
				current = current.next;
			}
			return 0;
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
		int[] arr = {1,2,3,4};
		for(int i =0; i < arr.length;i++){
			llist.append(arr[i]);
		}
		llist.display();
		int length = llist.getLength();
		System.out.println("Length is: "+length);
		int res = llist.getNode(5);
		System.out.println("The value is: "+res);
	}
}
