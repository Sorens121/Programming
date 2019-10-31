package Sorting;

public class selectionSort {
	public static void sort(int[] arr) {
		int n = arr.length;
		for(int i = 0;i < n -1;i++){
			int min_index = i;
			for(int j = i+1;j < n;j++){
				if(arr[j] < arr[min_index]){
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {64,25,12,22,11};
		sort(arr);
		StringBuffer str = new StringBuffer();
		for(int i = 0;i < arr.length;i++){
			str.append(arr[i]+ " ");
		}
		System.out.print(str);
	}
}
