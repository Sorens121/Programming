package LinkedLIstFromScratch;

public class FindLengthRecursive {
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
		
		public int findLength(Node temp){
			
			if(temp == null){
				return 0;
			} else {
				return 1 + findLength(temp.next);
			}
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
		int[] arr = {1,2,3,4};
		for(int i  =0;i < arr.length; i++){
			llist.append(arr[i]);
		}
		llist.display();
		int length = llist.findLength(llist.head);
		System.out.println("Length of the list is:" +length);
	}
}
