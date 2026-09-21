package exe;

public class Exe1 {

	public static void main(String[] args) {
//		add numbers from 1 to 100
		
		int sum = 0;
		
		for(int i = 1 ; i <= 100 ; i++) {
			sum += i;
//			sum = sum + i;
		}
		
		System.out.println("The sum is : " + sum);

	}

}
