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
		} // end if
		return count8(n);
	}

	public static int strCount(String str, String sub) {

		// System.out.println("length of sub " + sub.length());
		
		// BASE CASES *WANT TO ALWAYS TEST FOR EDGE CASES LIKE EMPTY STRINGS, NULL, AND/OR STRING IS TOO LARGE TO FIT IN MAIN MEMORY*
		
		//***Usually you put the null pointer exception check before anything else!!***
		if(sub == null)
			return 0;
		
		// if there is nothing in sub then it will return 0
		if(sub.length() == 0)
			return 0;
		// if there are less letters in string than the sub then return 0
		if (str.length() < sub.length())
			return 0;
		
		// int numLetters = sub.length();
		String substr = str.substring(0, sub.length());

		if (substr.equals(sub)) {
			return 1 + strCount(str.substring(sub.length()), sub);
		}
		// if we dont find the sub word
		// by taking out the first letter in str
		return strCount(str.substring(1), sub);

	}
	
	public static String stringClean(String str) {
		
		//base case
		
		// always checking null first!!
		//since I am returning a string i can return null.
		if(str == null)
			return null;
		
		if(str.length() <= 1)
			return str;
		
		if(str.charAt(0) == str.charAt(1))
			// the first 2 letters are the same, so stringClean() again minus that letter
			return stringClean(str.substring(1));
		
		//the first 2 letters are different, then we want 
		return str.charAt(0) + stringClean(str.substring(1));		
	}

	public static void main(String[] args) {
//		System.out.println(count8(88188));
//		System.out.println(count8(88818));
//		System.out.println(count8(9293));
//		System.out.println(count8(88888));
//		System.out.println(count8(0));
//		System.out.println(count8(58));

//		System.out.println(strCount("catcowccat", null));
		
		
	}
}
