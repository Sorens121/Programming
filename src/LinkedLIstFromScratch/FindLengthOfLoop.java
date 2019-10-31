package LinkedLIstFromScratch;

public class FindLengthOfLoop {
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
		
		public void insert(int value){
			Node newNode = new Node(value);
			if(head == null){
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		public void createLoop(Node head, int x){
			Node p = head, q = head;
			while(q.next != null){
				q = q.next;
			}
			if(x > 0){
				x -=1;
				for(int i =0;i < x;i++){
					p = p.next;
				}
				q.next = p;
			}
		}
		
		public int findLoop(Node head){
			Node prev = head, current = head;
			while(prev != null && current != null && current.next != null){
				prev = prev.next;
				current = current.next.next;
				
				if(prev == current){
					//return true;
					return findLength(prev);
				}
			}
			//return false;
			return 0;
		}
		
		public int findLength(Node temp) {
			int count = 0;
			Node current = temp;
			while(current.next != temp){
				count++;
				current = current.next;
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
	
	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		int[] arr = {1,2,3,4};
		for(int i =0;i < arr.length;i++){
			llist.insert(arr[i]);
		}
		llist.display();
		llist.createLoop(llist.head, 0);
		//boolean res = llist.findLoop(llist.head);
		int res = llist.findLoop(llist.head);
		System.out.println(res);
	}
}
