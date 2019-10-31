package LinkedList;

public class deletion {
	static class Node{
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
			newNode.next = head;
			head = newNode;
		}
		
		public void deleteAtPosition(int key){
			Node prev = null, cur = head;
			// if deleted node is the head
			if(cur != null & cur.value == key){
				head = cur.next;
				return;
			}
			// if deleted node is in middle
			while(cur != null && cur.value != key){
				prev = cur;
				cur = cur.next;
			}
			prev.next = cur.next;
			
			if(cur == null)
				return;
		}
		
		public void printList(){
			Node current = head;
			while(current != null){
				System.out.print(current.value+" ");
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,3,4,5};
		for(int i =0;i < arr.length;i++){
			llist.push(arr[i]);
		}
		
		llist.printList();
		llist.deleteAtPosition(3); // middle node
		//llist.deleteAtPosition(5); // head node
		//llist.deleteAtPosition(1); // end node
		System.out.println();
		llist.printList();
	}
}
