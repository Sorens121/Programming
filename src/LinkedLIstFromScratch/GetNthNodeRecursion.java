package LinkedLIstFromScratch;

public class GetNthNodeRecursion {
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
		
		public int getNthNode(Node temp, int index){
			int count = 1;
			if(temp == null){
				return 0;
			}
			if(count == index){
				return temp.value;
			} else {
				return getNthNode(temp.next, index-1);
			}
		}
		
		public void display() {
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
			llist.append(arr[i]);
		}
		llist.display();
		int res = llist.getNthNode(llist.head, 6);
		System.out.print("Value is: "+res);
		
	}
}
