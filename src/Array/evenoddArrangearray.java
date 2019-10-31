package Array;

import java.util.Arrays;

public class evenoddArrangearray {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		int even_pos = arr.length/2;
		int odd_pos = arr.length - even_pos;
		int[] temp = new int[arr.length];
		for(int i =0;i < arr.length;i++){
			temp[i] = arr[i];
		}
		Arrays.sort(temp);
		
		int j = odd_pos -1;
		for(int i= 0;i < arr.length;i+=2){
			arr[i] = temp[j];
			j--;
		}
		int k = odd_pos;
		for(int i =1;i < arr.length;i+=2){
			arr[i] = temp[k];
			k++;
		}
		
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
