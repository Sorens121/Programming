package Miscellaneous;

public class thisKeyword {
	int a;
	int b;
	
	public void setData1(int x,int y) {
		 a = x;
		 b = y;
	}
	
	public void setData2(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void showData(){
		System.out.println("Value of A is :"+a);
		System.out.println("Value of B is :"+b);
	}
	
	public static void main(String[] args){
		thisKeyword obj = new thisKeyword();
		obj.setData1(5,10);
		obj.showData();
		obj.setData2(1,2);
		obj.showData();
	}
}
