package LinkedList;

public class removeDuplicates {
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
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		/*
		public void deleteNode(int key){
			Node prev = null, current = head;
			while(current != null && current.value != key){
				prev = current;
				current = current.next;
			}
			Node temp = current.next;
			prev.next = temp;
		}
		
		 */
		
		public void delete(){
			Node current = head;
			while(current != null){
				Node temp = current;
				while(temp != null && current.value == temp.value){
					temp = temp.next;
				}
				current.next = temp;
				current = current.next;
			}
		}
		
		public void printList(){
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
		int[] arr ={11,11,11,13,13,12};
		for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.printList();
		llist.delete();
		llist.printList();
	}
}
