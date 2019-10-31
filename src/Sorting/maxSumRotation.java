package Sorting;

public class maxSumRotation {
	public static int maxSum(int[] arr){
		int sum =0, currSum = 0;
		for(int i = 0; i < arr.length;i++){
			sum += arr[i];
			currSum += i * arr[i];
		}
		
		int max_sum = currSum;
		
		for(int j = 1;j < arr.length;j++){
			currSum = currSum + sum - arr.length * arr[arr.length - j];
			if(max_sum < currSum){
				max_sum = currSum;
			}
		}
		return max_sum;
	}
	
	public static void main(String[] args){
		int[] arr = {10,1,2,3,4,5,6,7,8,9};
		System.out.print(maxSum(arr));
	}
}
