package recursion;

public class RecursionProblems {
	
	public static int count8(int n) {

		// base case
		if (n == 0) {
			return 0;
		}

		// get the ones place and see if it is an 8
		int onesPlace = n % 10;
		n /= 10; // getting rid of the ones place

		if (onesPlace == 8) {
			int tensPlace = n % 10;
			if (tensPlace == 8) {
				return 2 + count8(n); // means we have 8 right next to 8 -> 88
			} else {
				return 1 + count8(n); // means we DO NOT have 8 right next to 8 -> x8 or 8x
			} // end if
		}//end if
		return count8(n);
	}
	
	
	public static void main(String[] args) {
		System.out.println(count8(88188));
		System.out.println(count8(88818));
		System.out.println(count8(9293));
		System.out.println(count8(88888));
		System.out.println(count8(0));
		System.out.println(count8(58));
	}
}
