package Sorting;

import java.util.Scanner;

public class countRotation {
	public static int getCount(int[] arr){
		int n = arr.length;
		int index = findMin(arr,0, n-1);
		return index;
	}
	
	public static int findMin(int[] arr, int low, int high){
		if(low> high){
			return 0;
		}
		if(low == high){
			return low;
		}
		int mid = (high + low)/2;
		System.out.println(mid);
		if(low < mid && arr[mid] < arr[mid - 1]){
			return mid;
		}
		if(mid < high && arr[mid] > arr[mid +1]){
			return mid+1;
		}
		
		if(arr[high] > arr[mid] && arr[low] > arr[mid]){
			return findMin(arr,low, mid -1);
		}else {
			return findMin(arr, mid + 1, high);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i < n;i++){
				arr[i] = sc.nextInt();
			}
			System.out.println("Nos of Rotation: "+getCount(arr));
		}
	}
	
}
