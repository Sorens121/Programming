package LinkedList;

public class removeDuplicatesUnsortedList1 {
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
		
		public void append(int data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
			}
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public void removeDuplicates(){
			Node current1 = head, current2 = null, temp = null;
			while(current1 != null && current1.next != null){
				current2 = current1;
				while(current2.next != null){
					if(current1.value == current2.next.value){
						temp = current2.next;
						current2.next = current2.next.next;
					}else {
						current2 = current2.next;
					}
				}
				current1 = current1.next;
			}
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
		int[] arr = {12,11,12,21,41,43,21};
		for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.printList();
		llist.removeDuplicates();
		llist.printList();
	}
}
