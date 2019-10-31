package GeeksforGeeks;

import java.util.Scanner;

public class BitonicArray {
	public static int findPivot(int[] arr, int low, int high){
		int mid = low + (high - low)/2;
		if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
			return mid;
		}else{
			if(arr[mid] > arr[mid +1] && arr[mid] < arr[mid-1])
				return findPivot(arr,low,mid);
			return findPivot(arr,mid,high);
		}
	}
	
	public static int binary_inc(int[] arr, int low, int high,int key){
		int mid = low + (high - low)/2;
		if(low > high)
			return -1;
		if(arr[mid] == key)
			return mid;
		if(arr[mid] >= key)
			return binary_inc(arr,low,mid-1,key);
		return binary_inc(arr,mid+1,high,key);
	}
	
	public static int binary_dec(int[] arr, int low, int high, int key){
		int mid = low + (high - low)/2;
		if(low > high)
			return -1;
		if(arr[mid] == key)
			return mid;
		if(arr[mid] >= key)
			return binary_dec(arr,mid+1,high,key);
		return binary_dec(arr,low,mid-1,key);
	}
	
	public static int find(int[] arr, int low, int high,int key){
		int pivot = findPivot(arr,low,high);
		int left = binary_inc(arr,low,pivot,key);
		int right = binary_dec(arr,pivot,high,key);
		
		if(left == right && left == -1)
			return -1;
		if(left != -1)
			return left;
		else
			return right;
	}
	public static void main(String[] args){
		/*
		int[] arr = {1,3,5,7,9,10,12,13,11,8,6,4,2};
		int key = 4;
		//int index = findPivot(arr,0,arr.length-1);
		//System.out.println(index+"  "+arr[index]);
		//System.out.println("Not Found");
		//int index1 = binary_inc(arr,0,arr.length-1,key);
		//System.out.println(index1+"  "+arr[index1]);
		int index = find(arr,0,arr.length-1,key);
		if(index !=-1)
			System.out.println(index);
		else
			System.out.print(-1);
			*/
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++){
			arr[i] = scanner.nextInt();
		}
		int key = scanner.nextInt();
		System.out.println(arr.length);
		int index = find(arr,0,arr.length-1,key);
		if(index !=-1)
			System.out.println(index);
		else
			System.out.print(-1);
	}
}
