package Sorting;

public class bubbleSort {
	public static void sort(int[] arr) {
		int n = arr.length;
		for(int i = 0;i < n -1;i++){
			for(int j = 0; j < n-i-1;j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr = {5,1,4,2,8};
		sort(arr);
		StringBuffer sb = new StringBuffer();
		for(int i =0;i < arr.length;i++){
			sb.append(arr[i]+" ");
		}
		System.out.print(sb);
	}
}
