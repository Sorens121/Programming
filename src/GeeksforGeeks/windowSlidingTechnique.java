package GeeksforGeeks;

public class windowSlidingTechnique {
	public static int window(int[] arr, int k){
		int n = arr.length;
		int max_sum = 0;
		for(int i = 0;i < k ;i++){
			max_sum += arr[i];
		}
		int window_sum = max_sum;
		for(int j = k;j < n ;j++){
			window_sum += arr[j] - arr[j-k];
			max_sum = Math.max(max_sum,window_sum);
		}
		return max_sum;
	}
	
	public static void main(String[] args){
		int[] arr = {1,4,2,10,2,3,1,0,20};
		int k = 4;
		int res = window(arr,k);
		System.out.println(res);
	}
}
