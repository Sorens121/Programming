package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NthFromTheEndTwoPointerMethod {
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
		
		public int findNode(Node temp, int index){
			Node prev = temp, current = temp;
			int count = 0;
			if(temp == null){
				return -1;
			}
			if(temp != null){
				while(count < index){
					if(current == null){
						return -1;
					}
					current = current.next;
					count++;
				}
				
				while(current != null){
					prev = prev.next;
					current = current.next;
				}
				return prev.value;
			}
			return -1;
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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			LinkedList llist = new LinkedList();
			String line = br.readLine();
			String[] str = line.trim().split("\\s+");
			int n = Integer.parseInt(str[0]);
			int index = Integer.parseInt(str[1]);
			int[] arr = new int[n];
			//System.out.print(n +" "+ index);
			String line2 = br.readLine();
			String[] str2 = line2.trim().split("\\s+");
			for(int i = 0;i < n;i++){
				arr[i] = Integer.parseInt(str2[i]);
			}
			
			// creating linkedlist
			for(int j =0; j < arr.length; j++){
				llist.append(arr[j]);
			}
			int res = llist.findNode(llist.head, index);
			System.out.println(res);
		}
	}
}
