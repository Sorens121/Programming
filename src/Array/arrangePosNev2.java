package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class arrangePosNev2 {
	public static void rightRotate(int[] arr, int start, int end){
		int temp = arr[end];
		for(int i = end;i > start;i--){
			arr[i] = arr[i-1];
		}
		arr[start] = temp;
	}
	
	public static void arrange(int[] arr,int n){
		int outOfPlace = -1;
		for(int i =0;i < n;i++) {
			if(outOfPlace >= 0){
				if((arr[i] >= 0 && arr[outOfPlace] < 0) || (arr[i] < 0 && arr[outOfPlace] >=0)){
					rightRotate(arr,outOfPlace,i);
					// update out of place index to new if found else reset back to -1
					if(i - outOfPlace > 2){
						outOfPlace +=2;
					}else{
						outOfPlace = -1;
					}
				}
			}
			
			// if out of place is not found yet
			if(outOfPlace == -1) {
				if ((arr[i] >= 0 && i % 2 == 0) || (arr[i] < 0 && i % 2 != 0)) {
					outOfPlace = i;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,-4,-1,4};
		int n = arr.length;
		arrange(arr,n);
		//rightRotate(arr,0,n-1);
		for(int i =0;i < n;i++){
			System.out.print(arr[i]+" ");
		}
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- >0){
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String line = br.readLine();
			String[] str = line.trim().split("\\s+");
			for(int i =0;i < n;i++){
				arr[i] = Integer.parseInt(str[i]);
			}
			arrange(arr,n);
			StringBuffer sb = new StringBuffer();
			for(int i =0;i < n;i++){
				sb.append(arr[i]+" ");
			}
			System.out.println(sb);
		}
		br.close();
		*/
	}
}
