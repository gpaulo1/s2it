package br.com.s2it.exercise8;

public class Exercise8 {

	/**
	 * Responsible to mix the number among higher variable 
	 * @param a 
	 * @param b
	 * @return 
	 */
	public int calcNumber(int a, int b) {
		String strA = String.valueOf(a);
		String strB = String.valueOf(b);
		
		if(strA.length() >= strB.length()) 
			return iterateNumber(strB, strA);
		
		return iterateNumber(strA, strB);
		
	}

	/**
	 * Iterate through declared less size variable to get expected result
	 * 
	 * @param lessNumber: The number with less size 
	 * @param higherNumber: The number with higher size 
	 * @return
	 */
	private Integer iterateNumber(String lessNumber, String higherNumber) {
		String strC = "";
		for(int i=0; i<lessNumber.length(); i++) {
			strC += higherNumber.substring(i, i + 1);
			strC += lessNumber.substring(i, i + 1);
			
			if(lessNumber.length() == (i+1) && lessNumber.length() < higherNumber.length()){
				strC += higherNumber.substring(i+1);
			}
		}
		int c = Integer.valueOf(strC);
		
		return c > 1000000 ? -1 : c;
	}

}
