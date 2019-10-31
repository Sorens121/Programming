package LinkedLIstFromScratch;

public class FindLoopTwoPointer {
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
		
		public void insert(int value){
			Node newNode = new Node(value);
			if(head == null){
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		
		public boolean findLoop(Node head){
			Node prev = head, current = head;
			while(current != null && current.next != null && prev != null){
				current = current.next.next;
				prev = prev.next;
				
				if(prev == current){
					return true;
				}
			}
			return false;
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
		int[] arr = {1,2,3,4,5};
		for(int i  = 0; i < arr.length; i++){
			llist.insert(arr[i]);
		}
		llist.display();
		llist.head.next.next.next.next = llist.head.next;
		boolean res = llist.findLoop(llist.head);
		if(!res){
			System.out.println("No loop");
		} else {
			System.out.println("Loop present");
		}
	}
}
