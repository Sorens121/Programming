package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListInsertion {
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
		
		public void insert(int value) {
			Node newNode = new Node(value);
			if(head == null) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		public void append(int value){
			Node newNode = new Node(value);
			Node current = head;
			if(head == null){
				head = newNode;
			}
			if(current == null){
				current = newNode;
			}
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public void display() {
			Node current = head;
			while(current != null) {
				System.out.print(current.value+" ");
				current = current.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--> 0){
			LinkedList llist = new LinkedList();
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[2*n];
			String line = br.readLine();
			String[] str = line.trim().split("\\s+");
			for(int j = 0; j < arr.length; j++){
				arr[j] = Integer.parseInt(str[j]);
			}
			
			// logic of the code
			for(int x=0,y=1; x < arr.length && y < arr.length; x+=2, y+=2){
				if(arr[y] == 0){
					llist.insert(arr[x]);
				} else {
					llist.append(arr[x]);
				}
			}
			llist.display();
		}
		
	}
}
