package GeeksforGeeks;

public class arrangePosNeg2 {
	/*
	public static void shift(int[] arr, int start, int end){
		int temp = arr[end];
		for(int i = end; i > start;i--){
			arr[i] = arr[i-1];
		}
		arr[start] = temp;
	}
	 */
	
	public static void arrange(int[] arr){
		int key, j = 0;
		for(int i = 1; i <arr.length;i++){
			key = arr[i];
			if(key > 0)
				continue;
			j = i-1;
			while(j >= 0 && arr[j] > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
		}
	}
	
	public static void print(int[] arr){
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args){
		int[] arr = {12,11,-13,-5,6,-7,5,-3,-6};
		arrange(arr);
		print(arr);
	}
}
