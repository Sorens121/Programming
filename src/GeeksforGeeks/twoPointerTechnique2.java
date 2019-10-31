package GeeksforGeeks;
// assumin the array is sorted
public class twoPointerTechnique2 {
	public static boolean findPair(int[] arr,int k){
		int n = arr.length;
		int i =0, j = n-1;
		while(i < j){
			if(arr[i] + arr[j] == k)
				return true;
			if(arr[i] + arr[j] < k){
				i++;
			}else{
				j--;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		int[] arr = {10,20,35,50,75,80};
		int k = 70;
		boolean res = findPair(arr,k);
		System.out.println(res);
	}
}
