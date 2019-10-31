package LinkedList;

public class getNthFromEndMethod2 {
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
		
		public void push(int data){
			Node newNode = new Node(data);
			if(head == null){
				head = newNode;
			}else{
				newNode.next = head;
				head = newNode;
			}
		}
		
		public int findNthNode(int pos){
			Node prev = head, current = head;
			int count = 0;
			while(count != pos){
				prev = prev.next;
				count++;
			}
			Node temp = prev;
			while(temp != null && current != null){
				temp = temp.next;
				current = current.next;
			}
			return current.value;
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
		int[] arr = {1,2,3,4,5};
		for(int i =0;i < arr.length;i++){
			llist.push(arr[i]);
		}
		
		llist.printList();
		int result = llist.findNthNode(5);
		System.out.println(result);
	}
}
