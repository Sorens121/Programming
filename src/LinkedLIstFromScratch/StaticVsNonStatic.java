package LinkedLIstFromScratch;

public class StaticVsNonStatic {
	static String str = "GeeksforGeeks";
	
	static class NestedStaticClass {
		public void printMessage() {
			System.out.println("Message from nested static class: "+str);
		}
	}
	
	class NestedNonStaticClass {
		public void display(){
			System.out.println("Message from inner class: "+str);
		}
	}
}

class Main {
	public static void main(String[] args) {
		StaticVsNonStatic.NestedStaticClass obj1 = new StaticVsNonStatic.NestedStaticClass();
		obj1.printMessage();
		
		StaticVsNonStatic obj2 = new StaticVsNonStatic();
		StaticVsNonStatic.NestedNonStaticClass obj3 = obj2.new NestedNonStaticClass();
		obj3.display();
	}
}
