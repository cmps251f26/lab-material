package test;

public class Test {

	public static void main(String[] args) {
	 
		System.out.println("Welcome to this house");
		
		int x = 20;
		if(x < 20) {
			System.out.println("x is less than 20");
		}else {
			
			System.out.println("No it is not");
		
		}
		
		System.out.println(add(33,55));
	}

	
	public static int add(int x , int y) {
		return x + y;
	}
}
