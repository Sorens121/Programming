package GeeksforGeeks;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteNode {
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
		
		public void append(int value) {
			Node newNode = new Node(value);
			Node current = head;
			if(head == null){
				head = newNode;
				return;
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
		
		public void delete(int pos) {
			Node current = head, prev = null;
			int count = 1;
			if(current != null && pos == 1){
				head = current.next;
				return;
			}
			while(count != pos && current != null){
				count++;
				prev = current;
				current = current.next;
			}
			if(current == null) return;
			prev.next = current.next;
		}
		
		public void display(){
			Node current = head;
			while(current != null){
				System.out.print(current.value+" ");
				current = current.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		/*
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,3};
		for(int i  =0; i < arr.length; i++){
			llist.append(arr[i]);
		}
		llist.display();
		llist.delete(2);
		llist.display();
		llist.delete(3);
		llist.display();
		
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			LinkedList llist = new LinkedList();
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String line = br.readLine();
			String[] str = line.trim().split("\\s+");
			for(int i =0;i < arr.length;i++){
				arr[i] = Integer.parseInt(str[i]);
			}
			for(int j =0; j < n; j++){
				llist.append(arr[j]);
			}
			int pos = Integer.parseInt(br.readLine());
			llist.delete(pos);
			llist.display();
		}
	}
}
