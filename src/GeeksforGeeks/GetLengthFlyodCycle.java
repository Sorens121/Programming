package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetLengthFlyodCycle {
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
				//return;
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
		public Node findLoop(Node head){
			Node prev = head, current = head;
			while(prev != null && current != null && current.next != null){
				prev = prev.next;
				current = current.next.next;
				
				if(prev == current){
					return current;
				}
			}
			return null;
		}
		
		public int getLength(Node temp){
			int count = 0;
			Node ptr = findLoop(temp);
			while(temp.next != ptr){
				count++;
				temp = temp.next;
			}
			return count;
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
//////		int[] arr = {1,2,3,4};
//////		for(int i =0;i < arr.length; i++){
//////			llist.append(arr[i]);
//////		}
//////		llist.display();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			LinkedList llist = new LinkedList();
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String line = br.readLine();
			String[] str = line.trim().split("\\s+");
			
			for(int i =0;i < n;i++){
				arr[i] = Integer.parseInt(str[i]);
			}
			
			for(int j =0; j < arr.length;j++){
				llist.append(arr[j]);
			}
			
			// creating loop
			Node p = llist.head, q = llist.head;
			int x = Integer.parseInt(br.readLine());
			
			while(q.next != null){
				q = q.next;
			}
			
			if(x > 0){
				for(int k =0; k < x;k++){
					p = p.next;
				}
				x = x-1;
			}
			q.next = p;
//			while(x-- > 0){
//				p = p.next;
//			}
//			q.next = p;
			
			int res = llist.getLength(llist.head);
			System.out.println(res);
		}
	}
}
