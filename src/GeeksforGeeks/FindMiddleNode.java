package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMiddleNode {
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
		
		public int findMiddle(Node node){
			Node prev = node, current = node;
			if(node == null){
				return -1;
			}
			
			while(current != null && current.next != null){
				current = current.next.next;
				prev = prev.next;
			}
			return prev.value;
		}
		
		
		public void display(){
			Node current = head;
			while(current != null){
				System.out.print(current.value+" ");
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			LinkedList llist = new LinkedList();
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String line = br.readLine();
			String[] str = line.trim().split("\\s+");
			
			for(int i =0; i < n; i++){
				arr[i] = Integer.parseInt(str[i]);
			}
			
			for(int j = 0; j < arr.length; j++){
				llist.append(arr[j]);
			}
			
			int res = llist.findMiddle(llist.head);
			System.out.println(res);
		}
	}
}
