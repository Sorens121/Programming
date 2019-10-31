package GeeksforGeeks;
// naive solution of complexity O(n^2)
public class twoPointerTechnique {
	public static boolean findPair(int[] arr, int k){
		int n = arr.length;
		//boolean res = false;
		for(int i =0;i < n;i++){
			for(int j =0;j < n;j++){
				if(arr[i] + arr[j] == k){
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		int[] arr = {10,20,35,50,75,80};
		int x = 70;
		boolean res = findPair(arr,x);
		System.out.println(res);
	}
}
