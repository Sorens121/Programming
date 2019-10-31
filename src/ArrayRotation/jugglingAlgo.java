package ArrayRotation;

public class jugglingAlgo {
	// first find gcd for rotation
	public static int findGcd(int n, int d) {
		if(n == 0)
			return d;
		if(d==0)
			return n;
		int x = n % d;
		n = d;
		d = x;
		return findGcd(n,d);
	}
	// juggling algo
	public static void rotate(int[] arr, int d) {
		int i, j, k, temp;
		int n = arr.length;
		int gcd = findGcd(n, d);
		for(i = 0;i < gcd;i++){
			temp = arr[i];
			j = i;
			while(true){
				k = j + d;
				if(k >= n){
					k = k - n;
				}
				if(k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}
	
	// printing function
	public static void printArray(int[] arr){
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		int d = 3;
		rotate(arr, d);
		printArray(arr);
	}
}
