package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DetectLoop {
	static class Node {
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
			next = null;
		}
	}
	
	static class LinkedList{
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
		
		public boolean findLoop(Node head){
			Node prev = head, current = head;
			while(prev != null && current != null && current.next != null){
				current = current.next.next;
				prev = prev.next;
				
				if(prev == current){
					return true;
				}
			}
			return false;
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
//		LinkedList llist = new LinkedList();
//		int[] arr = {1,2,3,4,5};
//		for(int i =0;i < arr.length;i++){
//			llist.append(arr[i]);
//		}
//		llist.display();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			LinkedList llist = new LinkedList();
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String line = br.readLine();
			String[] str = line.trim().split("\\s+");
			for(int i = 0;i < n; i++){
				arr[i] = Integer.parseInt(str[i]);
			}
			
			for(int j = 0;j < arr.length;j++){
				llist.append(arr[j]);
			}
			
			int x = Integer.parseInt(br.readLine());
			// logic for creating the loop
			Node p = llist.head, q = llist.head;
			// find last of list and point to x values of node
			while(q.next != null){
				q = q.next;
			}
			if(x > 0) {
				x = x - 1;
				for (int k = 0; k < x; k++) {
					p = p.next;
				}
				q.next = p;
			}
			
			boolean res = llist.findLoop(llist.head);
			if(res){
				System.out.println("True");
			} else{
				System.out.println("False");
			}
		}
	}
}
