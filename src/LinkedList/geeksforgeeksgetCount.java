package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class geeksforgeeksgetCount {
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
		
		public int getCount(Node head){
			Node current = head;
			int counter = 0;
			if(head == null){
				return 0;
			}
			while(current != null){
				current = current.next;
				counter++;
			}
			return counter;
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
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String line = br.readLine();
			String[] str = line.trim().split("\\s+");
			for(int i = 0;i < n;i++){
				arr[i] = Integer.parseInt(str[i]);
			}
			LinkedList llist = new LinkedList();
			for(int i = 0;i < arr.length;i++){
				llist.append(arr[i]);
			}
			//llist.printList();
			System.out.println("Size: "+llist.getCount(llist.head));
		}
		br.close();
		
		// testing
		/*
		int[] arr = {1,2,3,4,5};
		for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.printList();
		*/
	}
}
