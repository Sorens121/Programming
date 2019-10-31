package LinkedList;

public class getMiddleNode {
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
		
		public int getMidNode(){
			Node prev = head, current = head;
			//Node temp = null;
			while(current != null && current.next != null){
				//temp = prev;
				current = current.next.next;
				prev = prev.next;
			}
			
			return prev.value;
			//return temp.value;
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
		int[] arr = {1,2,3,4,5};
		for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.printList();
		int result = llist.getMidNode();
		System.out.println(result);
	}
}
