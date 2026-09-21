package exe;

public class Exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;
		int y = 50;
		
		System.out.printf("Before the swap x = %d and y= %d \n" , x , y);
		
		int temp = x;  //100
		x = y;  //50
		y= temp; //100
		
		System.out.printf("After the swap x = %d and y= %d " , x , y);
	}

}
