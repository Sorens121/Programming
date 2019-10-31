package LinkedLIstFromScratch;

public class FindNthNodeFromEndTwoPointerMethod {
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
		
		public void append(int value) {
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
		
		public int findNthNode(int index){
			Node prev = head, current = head;
			int count = 0;
			if(head != null){
				// move current by index
				while(count < index) {
					if (current == null) {
						return 0;
					}
					current = current.next;
					count++;
				}
				
				// move prev by one till current point to null
				while(current != null){
					prev = prev.next;
					current = current.next;
				}
				return prev.value;
			}
			return 0;
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
		for(int i  =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		llist.display();
		int res = llist.findNthNode(4);
		if(res != 0)
			System.out.println("Value is: "+res);
		else
			System.out.println("No node found");
	}
}
