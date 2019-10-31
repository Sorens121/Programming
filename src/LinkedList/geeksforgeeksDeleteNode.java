package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class geeksforgeeksDeleteNode {
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
		
		public void append(int data){
			Node newNode = new Node(data);
			Node current = head;
			if(current == null){
				head = newNode;
				newNode.next = null;
				return;
			}
			
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public void printList(Node head) {
			Node current = head;
			while(current != null){
				System.out.print(current.value+" ");
				current = current.next;
			}
			System.out.println();
		}
		
		public Node deleteNode(Node head, int pos){
			Node current = head, prev = null;
			if(pos == 1){
				head = current.next;
				return head;
			}
			int counter = 1;
			while(current != null && counter != pos){
				counter++;
				prev = current;
				current = current.next;
			}
			prev.next = current.next;
			return head;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String line = br.readLine();
			String[] str = line.trim().split("\\s+");
			int pos = Integer.parseInt(br.readLine());
			for(int i =0;i < n;i++){
				arr[i] = Integer.parseInt(str[i]);
			}
			
			
			LinkedList llist = new LinkedList();
			Node head = new Node(arr[0]);
			for(int i =0;i < arr.length;i++){
				llist.append(arr[i]);
			}
			
			Node result = llist.deleteNode(llist.head,pos);
			llist.printList(result);
			
			// testing
			/*
			int[] arr = {1,2,3};
			for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
			}
		    */
		}
		br.close();
	}
}
