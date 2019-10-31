package LinkedList;

import java.util.HashSet;

public class removeDuplicatesUnsortedList2 {
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
		
		public void append(int data) {
			Node newNode = new Node(data);
			if(head == null){
				head = newNode;
			}
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public void removeDuplicates() {
			HashSet<Integer> s = new HashSet<>();
			Node current = head, prev = null;
			while(current != null) {
				int data = current.value;
				if(s.contains(data)) {
					prev.next = current.next;
				}else{
					s.add(data);
					prev = current;
				}
				current = current.next;
			}
		}
		
		public void printList() {
			Node current = head;
			while(current != null) {
				System.out.print(current.value+" ");
				current = current.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		int[] arr = {12,11,12,15,14,11,13};
		for(int i = 0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.printList();
		llist.removeDuplicates();
		llist.printList();
	}
}
