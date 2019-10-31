package LinkedLIstFromScratch;

import java.util.HashSet;

public class DetectLoopHashing {
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
		
		public void insert(int value){
			Node newNode = new Node(value);
			if(head == null){
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		public int findLoop(Node node){
			HashSet<Node> h = new HashSet<Node>();
			while(node != null){
				if(h.contains(node))
					return 0;
				else
					h.add(node);
				node = node.next;
			}
			return -1;
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
		for(int i =0; i < arr.length; i++){
			llist.insert(arr[i]);
		}
		llist.display();
		//llist.head.next.next.next.next = llist.head.next;
		int res = llist.findLoop(llist.head);
		if(res != 0){
			System.out.println("No loop detected");
		} else{
			System.out.println("Loop detected");
		}
	}
}
