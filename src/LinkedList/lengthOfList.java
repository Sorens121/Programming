package LinkedList;

public class lengthOfList {
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
		
		public void append(int data){
			Node newNode = new Node(data);
			if(head == null){
				head = newNode;
			}
			Node current = head;
			while (current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public int getLength(){
			Node current = head;
			int counter = 0;
			while(current != null){
				current = current.next;
				counter++;
			}
			return counter;
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
		int[] arr = {1,2,3,4,5,6};
		for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.printList();
		System.out.println("Length of List is: "+llist.getLength());
	}
}
