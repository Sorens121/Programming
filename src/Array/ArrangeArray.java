package Array;

public class ArrangeArray {
	public static void main(String[] args){
		//int[] arr = {-1,-1,6,1,9,3,2,-1,4,-1};
		int[] arr = {0,14,4,7,11,12,-1,13,8,2,1,5,3,6,-1,-1};
		for(int i =0;i < arr.length;i++){
			if(arr[i] !=-1 && arr[i] != i){
				int x = arr[i];
				
				while(arr[x] != -1 && arr[x] != x){
					int y = arr[x];
					arr[x] = x;
					x = y;
				}
				arr[x] = x;
			}
			
			if(arr[i] != i){
				arr[i] = -1;
			}
		}
		
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
