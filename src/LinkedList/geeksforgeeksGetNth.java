package LinkedList;

import java.util.Scanner;

public class geeksforgeeksGetNth {
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
		
		public void append(int data) {
			Node newNode = new Node(data);
			if(head == null){
				head = newNode;
			}
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public int findNth(Node head, int pos){
			Node current = head;
			int counter = 1;
			while(current != null){
				if(counter == pos){
					return current.value;
				}
				current = current.next;
				counter++;
			}
			assert(false);
			return 0;
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
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0){
			int n = scn.nextInt();
			int pos = scn.nextInt();
			int[] arr = new int[n];
			for(int i =0;i < n;i++){
				arr[i] = scn.nextInt();
			}
			
			LinkedList llist = new LinkedList();
			for(int i =0;i < arr.length;i++){
				llist.append(arr[i]);
			}
			
			int result = llist.findNth(llist.head,pos);
			System.out.println(result);
		}
		
		/*
		// testing
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,3};
		for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		llist.printList();
		
		 */
	}
}
