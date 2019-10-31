package GeeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class tripletZeroMethod1 {
	public static ArrayList<Integer> findZero(int[] arr, int n){
		ArrayList<Integer> newArr = new ArrayList<>();
		for(int i = 0;i < n-2;i++){
			for(int j = i+1;j < n-1 ;j++){
				for(int k = j+1;k < n;k++){
					if(arr[i] + arr[j] + arr[k] == 0){
						newArr.add(arr[i]);
						newArr.add(arr[j]);
						newArr.add(arr[k]);
					}
				}
			}
		}
		return newArr;
	}
	
	public static void main(String[] args){
		int[] arr ={0,-1,2,-3,1};
		int n = arr.length;
		ArrayList<Integer> res = findZero(arr,n);
		System.out.println(res);
	}
}
