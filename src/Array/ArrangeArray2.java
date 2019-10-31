package Array;

import java.util.HashSet;

public class ArrangeArray2 {
	public static void main(String[] args){
		HashSet<Integer> s = new HashSet<>();
		//int[] arr = {-1,-1,6,1,9,3,2,-1,4,-1};
		int[] arr = {0,14,4,7,11,12,-1,13,8,2,1,5,3,6,-1,-1};
		for(int i = 0;i < arr.length;i++){
			s.add(arr[i]);
		}
		
		for(int i =0;i < arr.length;i++){
			if(s.contains(i)) {
				arr[i] = i;
			}else{
				arr[i] = -1;
			}
		}
		
		for(int i =0;i< arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
