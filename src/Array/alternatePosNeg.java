package Array;
// Given an unsorted array of positive and negative numbers.
// Your task is to create an array of alternate positive and
// negative numbers without changing the relative order of
// positive and negative numbers.

// Input : 9 4 -2 -1 5 0 -5 -3 2
// Output: 9 -2 4 -1 5 -5 0 -3 2

public class alternatePosNeg {
	public static void rightRotate(int[] arr, int start, int end){
		int temp = arr[end];
		for(int i = end;i > start;i--){
			arr[i] = arr[i-1];
		}
		arr[start] = temp;
	}
	
	public static void arrange(int[] arr, int n){
		int outOfPlace = -1;
		for(int i = 0;i < n;i++){
			if(outOfPlace == -1){
				if((arr[i] >= 0 && i % 2 !=0) || (arr[i] < 0 && i % 2 == 0)){
					outOfPlace = i;
					//System.out.println(outOfPlace);
				}
			}
			
			// find second point
			if(outOfPlace >= 0){
				if((arr[i] < 0 && arr[outOfPlace] >= 0) || (arr[i] >=0 && arr[outOfPlace] < 0)) {
					rightRotate(arr, outOfPlace, i);
					
					// update out of place
					if (i - outOfPlace > 2) {
						outOfPlace += 2;
					} else {
						outOfPlace = -1;
					}
				}
			}
		}
	}
	public static void main(String[] args){
		int[] arr = {9,4,-2,-1,5,0,-5,-3,2};
		int n = arr.length;
		arrange(arr,n);
		//rightRotate(arr,0,n-1);
		for(int i = 0;i < n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
