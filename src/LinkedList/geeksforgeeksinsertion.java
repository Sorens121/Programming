package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class geeksforgeeksinsertion {
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
		
		public void push(int data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
		
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
		
		public void printList(){
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
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n*2];
			String line = br.readLine();
			String[] str = line.trim().split("\\s+");
			
			for(int i =0;i < arr.length;i++){
				arr[i] = Integer.parseInt(str[i]);
			}
			/*
			// displaying
			System.out.println();
			for(int i =0;i < arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			*/
			LinkedList llist = new LinkedList();
			for(int i = 1;i < arr.length; i=i+2){
				//System.out.print(arr[i]);
				if(arr[i] == 0){
					llist.push(arr[i-1]);
				}else{
					llist.append(arr[i-1]);
				}
			}
			System.out.println();
			llist.printList();
		}
		br.close();
	}
}


/*
test cases:
3
5
9 0 5 1 6 1 2 0 5 0
3
5 1 6 1 9 1
4
15 0 36 0 95 0 14 0

output:
5 2 9 5 6
5 6 9
14 95 36 15

 */