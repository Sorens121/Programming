package GeeksforGeeks;
// brute force approach to find maximum sum of k

public class maxSumK {
	public static int maxSum(int[] arr, int k){
		int n = arr.length;
		int max_sum = Integer.MIN_VALUE;
		for(int i =0;i < n -k +1;i++){
			int current_sum = 0;
			for(int j = 0;j < k;j++){
				current_sum = current_sum + arr[i+j];
			}
			max_sum = Math.max(current_sum,max_sum);
		}
		return max_sum;
	}
	public static void main(String[] args){
		int[] arr = {100,200,300,400};
		int k = 2;
		int res = maxSum(arr,k);
		System.out.print(res);
	}
}
