package LinkedList;

import java.util.HashSet;

public class detectLoop {
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
		
		public boolean detectLoop(){
			HashSet<Node> s = new HashSet<>();
			Node current = head;
			while(current != null){
				if(s.contains(current)){
					return true;
				}
				s.add(current);
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
		// adding a loop
		llist.head.next.next.next = llist.head;
		boolean result = llist.detectLoop();
		System.out.print(result);
	}
}
