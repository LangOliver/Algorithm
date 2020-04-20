
public class CompareBinToHex {
	

	static boolean compareBinToHex(String binString, String hexString) {
		return (convertIntValueFromBase(binString, 2) == convertIntValueFromBase(hexString, 16)); 
	}
	
	static int convertIntValueFromBase(String s, int base) {
		int value = 0;
		for (int i = s.length()-1; i>=0; i-- ) {
			int digit = digitFromString(s.charAt(i));
			value += (digit * Math.pow(base, s.length()-(i+1)));
		}
		return value;
		
	}
	
	static int digitFromString(char c) {
		char[] hexValue= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		System.out.println("Character" + c);
		for (int z = 0 ; z < hexValue.length; z ++) {
			System.out.println("HexValue: " + hexValue[z]);
		    if (hexValue[z] == c) {
		    	return z;
		    }
		}
		return -1;
		
	}
	
    public static void main(String[] args) {
    	String binString = "11111111111101000010101";
    	String hexString = "7FFA15";
    	System.out.println("Is " +binString+ " the same as: "+hexString+": "  + compareBinToHex(binString,hexString));
    	
	}


}
