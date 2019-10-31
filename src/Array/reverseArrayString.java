package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverseArrayString {
	public static void reverse(char[] arr, int low, int high){
		while(low <= high){
			char temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String line = br.readLine();
			char[] arr = new char[line.length()];
			//System.out.println(line.length());
			for(int i=0;i< line.length();i++){
				arr[i] = line.charAt(i);
			}
			
			//reverse(arr,0,arr.length-1); --> TLE geeksforgeeks.org
			/*
			for(int i =0;i < arr.length;i++){
				System.out.print(arr[i]+" ");
			}*/
			StringBuffer sb = new StringBuffer();
			for(int i= line.length()-1;i >=0;i--){
				sb.append(arr[i]);
			}
			System.out.println(sb);
		}
	}
}
