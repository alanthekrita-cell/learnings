package string;

public class SubStringCheck {
	public static void main(String args[]) {
		SubStringCheck ssc = new SubStringCheck();
		System.out.println(ssc.checkSubString("abcd", "asbdc"));
	}

	public boolean checkSubString(String sub, String full) {
		if (sub.length() == 0) {
			return true;
		}

		int subPointer = 0;
		int fullPointer = 0;

		for(;fullPointer<full.length();fullPointer++) {
			if(sub.charAt(subPointer)==full.charAt(fullPointer)) {
				subPointer++;
			}
			if(subPointer==sub.length()) {
				return true;
			}
		}

		return false;
	}

}
