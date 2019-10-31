package LinkedLIstFromScratch;

public class FindCountIterativeMethod {
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
		
		
		public void insert(int value) {
			Node newNode = new Node(value);
			if(head == null){
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		public int getCount(int key){
			Node current = head;
			int count = 0;
			while(current != null){
				if(current.value == key){
					count++;
				}
				current = current.next;
			}
			return count;
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
		int[] arr ={1,2,1,4,1};
		for(int i = 0; i < arr.length; i++){
			llist.insert(arr[i]);
		}
		llist.display();
		int res = llist.getCount(1);
		System.out.println("Total count: "+res);
	}
}
