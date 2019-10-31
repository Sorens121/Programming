package GeeksforGeeks;

import java.util.Scanner;

public class bitonicArray2 {
	public static int binarySearch(int[] arr, int low, int high,int key){
		int index;
		if(low <= high){
			int mid = (low + high)/2;
			if(arr[mid] == key){
				index = mid;
				return mid;
			}
			if(mid+1 <= high && arr[mid] > arr[mid+1]){
				if(arr[mid] > key && arr[high] <= key){
					return binarySearch(arr,mid+1,high,key);
				}else{
					return binarySearch(arr,low,mid-1,key);
				}
			}else if(mid+1 <= high && arr[mid] < arr[mid+1]){
				if(arr[mid] > key && arr[low] <= key){
					return binarySearch(arr,low,mid-1,key);
				}else {
					return binarySearch(arr,mid+1,high,key);
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i < n;i++){
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		int index = binarySearch(arr,0,arr.length-1,key);
		System.out.println(index);
	}
	/*
	public static void bs(int st,int end,int ele)
	{
		if(st<=end)
		{
			int mid=(st+end)/2;
			if(ele==a[mid])
			{
				ind=mid;
				return;
			}
			if(mid+1<=end && a[mid]>a[mid+1])
			{
				if(ele<a[mid] && ele>=a[end])
				{
					bs(mid+1,end,ele);
					if(ind==-1)
						bs(st,mid-1,ele);
				}
				else
					bs(st,mid-1,ele);
				
			}
			else if(mid+1<=end && a[mid]<a[mid+1])
			{
				if(ele>=a[st] && ele<a[mid])
				{
					bs(st,mid-1,ele);
					if(ind==-1)
						bs(mid+1,end,ele);
				}
				else
					bs(mid+1,end,ele);
			}
		}
	}
	*/
}
