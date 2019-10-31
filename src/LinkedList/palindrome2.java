package LinkedList;

public class palindrome2 {
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
		
		public boolean checkPalindrome(){
			Node slow = head, fast = head, prev_slow = head;
			Node mid_node = null, second_head = null;
			while(fast != null && fast.next != null){
				prev_slow = slow;
				fast = fast.next.next;
				slow = slow.next;
			}
			
			// if length of palindrome is even
			
			if(fast == null){
				second_head = slow;
				prev_slow.next = null;
			}else{
				mid_node = slow; // store mid of odd length palindrome
			}
			// if length of palindrome is odd
			
			if(mid_node != null){
				second_head = slow.next;
				prev_slow.next = null;
			}
			
			slow = reverse(second_head);
			fast = head;
			boolean res = compare(fast,slow);
			return res;
		}
		
		public Node reverse(Node second_head){
			Node prev = null, newNext = null, current = second_head;
			while(current != null){
				newNext = current.next;
				current.next = prev;
				prev = current;
				current = newNext;
			}
			second_head = prev;
			return second_head;
		}
		
		public boolean compare(Node head1, Node head2){
			Node temp1 = head1, temp2 = head2;
			while(temp1 != null && temp2 != null){
				if(temp1.value == temp2.value){
					temp1 = temp1.next;
					temp2 = temp2.next;
				}else{
					return false;
				}
			}
			
			if(temp1 == null && temp2 == null)
				return true;
			return false;
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
		int[] arr = {1,2,2,1};
		for(int i =0;i < arr.length;i++){
			llist.append(arr[i]);
		}
		
		llist.printList();
		boolean res = llist.checkPalindrome();
		System.out.println(res);
	}
}
