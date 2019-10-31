package LinkedList;

public class reverseLinkedlist {
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
		
		public Node reverseList(Node head){
			Node prev = null ,current = head, newnext = null;
			while(current != null){
				newnext = current.next;
				current.next = prev;
				prev = current;
				current = newnext;
			}
			
			head = prev;
			return head;
		}
		
		public void printList(Node head) {
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
		int[] arr = {1,2,3,4,5};
		for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.printList(llist.head);
		Node newHead = llist.reverseList(llist.head);
		llist.printList(newHead);
	}
}
