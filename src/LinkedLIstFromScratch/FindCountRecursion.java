package LinkedLIstFromScratch;

public class FindCountRecursion {
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
		
		public void insert(int value){
			Node newNode = new Node(value);
			if(head == null){
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		public int getCount(Node head,int key){
			if(head == null){
				return 0;
			}
			if(head.value == key){
				return 1 + getCount(head.next, key);
			}
			return getCount(head.next, key);
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
		for(int i =0;i < arr.length; i++){
			llist.insert(arr[i]);
		}
		llist.display();
		int res = llist.getCount(llist.head, 1);
		System.out.println("Total count: "+res);
	}
}
