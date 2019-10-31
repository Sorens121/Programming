package GeeksforGeeks;

import java.math.BigInteger;
import java.util.Scanner;

public class CatlanNumbers {
	/* recursion -> leads stackoverflow for large numbers
	public static int catalannos(int n){
		int sum = 0;
		if(n <= 1)
			return 1;
		for(int i =0;i < n;i++){
			sum += catalannos(i) * catalannos(n-i-1);
		}
		return sum;
	}
	*/
	public static BigInteger catalan(int n){
		BigInteger[] arr = new BigInteger[n+1];
		arr[0] = BigInteger.valueOf(1);
		arr[1] = BigInteger.valueOf(1);
		for(int i =2; i< n+1;i++){
			arr[i] = BigInteger.valueOf(0);
			for(int j =0;j < i;j++){
				arr[i] = arr[i].add(arr[j].multiply(arr[i-j-1]));
			}
		}
		return arr[n];
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger res = catalan(n);
		System.out.println(res);
	}
}
