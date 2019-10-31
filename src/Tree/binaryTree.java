package Tree;

public class binaryTree {
	static class Node{
		int value;
		Node left, right;
		
		public Node(int value){
			this.value = value;
			left = right = null;
		}
	}
	
	static class tree{
		Node root;
		
		public tree(){
			root = null;
		}
		
		public void insert(Node start, Node newNode){
			if(root == null){
				root = newNode;
				return;
			}
			if(start.value > newNode.value){
				if(start.left == null) {
					start.left = newNode;
				}
				insert(start.left, newNode);
			}
			
			if(start.value < newNode.value){
				if(start.right == null){
					start.right = newNode;
				}
				insert(start.right, newNode);
			}
		}
		
		public void display(Node start){
			if(start == null){
				return;
			}
			display(start.left);
			System.out.print(start.value+" ");
			display(start.right);
		}
	}
	
	public static void main(String[] args){
		tree bt = new tree();
		int[] arr = {10,3,2,5,11,20,21};
		for(int i =0;i < arr.length;i++){
			bt.insert(bt.root, new Node(arr[i]));
		}
		
		bt.display(bt.root);
	}
}
