package LinkedList;

public class deleteLinkedList {
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
		
		public void push(int data){
			Node newNode = new Node(data);
			if(head == null){
				head = newNode;
			}else{
				//Node current = head;
				newNode.next = head;
				head = newNode;
			}
		}
		
		public void deleteList(){
			head = null;
		}
		
		public void printList() {
			Node current = head;
			if(current == null){
				System.out.print("List is deleted.");
			}else {
				while (current != null) {
					System.out.print(current.value + " ");
					current = current.next;
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,3,4,5,6};
		for(int i = 0;i < arr.length;i++){
			llist.push(arr[i]);
		}
		llist.printList();
		llist.deleteList();
		llist.printList();
	}
}
