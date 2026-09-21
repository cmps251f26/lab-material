package exe;

public class Exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String divBy3 = "";
		String divBy5 = "";
		String divBy3And5 = "";

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				divBy3 += i + " , ";

			if (i % 5 == 0)
				divBy5 += i + " , ";

			if (i % 3 == 0 && i % 5 == 0)
				divBy3And5 += i + " , ";

		}

		System.out.println("Divisible by 3");
		System.out.println(divBy3);

		System.out.println("Divisible by 5");
		System.out.println(divBy5);

		System.out.println("Divisible by 5 and 3");
		System.out.println(divBy3And5);

	}

}
