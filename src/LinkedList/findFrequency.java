package LinkedList;

public class findFrequency {
	static int count = 0;
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
			if(head == null){
				head = newNode;
			}else{
				newNode.next = head;
				head = newNode;
			}
		}
		
		public int findCount(int key){
			Node current = head;
			int counter = 0;
			while(current != null){
				if(current.value == key){
					counter++;
				}
				current = current.next;
			}
			return counter;
		}
		
		public int findCount2(Node head, int key){
			if(head == null){
				return count;
			}
			if(head.value == key){
				count++;
			}
			return findCount2(head.next,key);
		}
		
		public void printList() {
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
		int[] arr = {1,2,1,4,2,1};
		for(int i = 0;i < arr.length;i++){
			llist.push(arr[i]);
		}
		
		llist.printList();
		int result = llist.findCount(1);
		System.out.println(result);
		//int result = llist.findCount2(llist.head,1);
		//System.out.println(result);
	}
}
