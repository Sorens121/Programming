package LinkedList;

import java.util.Stack;

public class palindrome1 {
	static class Node{
		int value;
		Node next;
		
		Node(int data){
			value = data;
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
			while (current.next != null){
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
		
		public boolean checkPalindrome(){
			Stack<Node> s = new Stack<>();
			Node current = head;
			// adding elements to stack
			
			while(current != null){
				s.push(current);
				current = current.next;
			}
			Node temp = head;
			boolean flag = true;
			while(temp != null){
				if(temp.value == s.pop().value){
					flag = true;
				}else{
					flag = false;
					break;
				}
				temp = temp.next;
			}
			return flag;
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
	
	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,1,2};
		for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		//llist.printList();
		boolean result = llist.checkPalindrome();
		System.out.println(result);
	}
}
