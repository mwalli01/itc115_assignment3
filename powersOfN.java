package assignments;

public class powersOfN {

	public static void main(String[] args) {
		printPowersOfN(5,3);
		printPowersOfN(2,7);
	}

	public static void printPowersOfN(int number, int exponent) {
		//for loop uses exponent parameter to determine how many times to loop
		for(int i = 0; i<exponent; i++) {
			//use math.pow uses the base number and i to calculate the current power of base
			System.out.println(Math.pow(number, i));
		}
	}

}
