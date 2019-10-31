package LinkedList;

public class searchKeyIterative {
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
		
		public void push(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
			}else{
				newNode.next = head;
				head = newNode;
			}
		}
		
		public boolean searchKey(int key){
			Node current = head;
			while(current != null){
				if(current.value == key)
					return true;
				current = current.next;
			}
			return false;
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
		int[] arr = {1,2,3,4};
		for(int i = 0;i < arr.length;i++){
			llist.push(arr[i]);
		}
		
		llist.printList();
		//boolean result = llist.searchKey(40);
		boolean result = llist.searchKey(1);
		if(result)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
