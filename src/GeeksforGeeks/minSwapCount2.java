package GeeksforGeeks;

public class minSwapCount2 {
	public static int minSwap(int[] arr, int k){
		int n = arr.length;
		int count = 0;
		// 1 > find the count of all nos less than equal to k
		for(int i =0;i < n;i++){
			if(arr[i] <= k){
				count++;
			}
		}
		System.out.println(count);
		// 2 > apply two pointer approach on the window of size count
		int bad = 0;
		for(int j = 0; j< count;j++){
			if(arr[j] > k){
				bad++;
			}
		}
		
		int ans = bad;
		System.out.println(ans);
		for(int i =0, j = count;j < n;i++,j++){
			if(arr[i] > k)
				bad--;
			if(arr[j] > k)
				bad++;
			
			ans = Math.min(ans,bad);
		}
		return ans;
	}
	
	public static void main(String[] args){
		int[] arr = {2,7,9,5,8,7,4};
		int k = 5;
		int res = minSwap(arr,k);
		System.out.println(res);
	}
}
