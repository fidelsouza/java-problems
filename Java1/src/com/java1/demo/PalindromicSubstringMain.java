package com.java1.demo;

public class PalindromicSubstringMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String ret = PalindromicSubstring("anas6");
		System.out.println(ret);

	}
	
	public static String PalindromicSubstring(String str) {
		
		String palindromicStr = "";
		
		char[] charArray = str.toCharArray();
		
		for(int i = 3; i< charArray.length; i++) {
			
			String strTemp = "";
			
			for(int j = 0; j<charArray.length; j++) {
				
				if( (j + i) <= charArray.length ) {
					
					strTemp = str.substring(j, j + i);
					
					if(isPalindromic(strTemp)) {
						palindromicStr = strTemp;
					}
				}
				
			}
			
		}
		
		if(palindromicStr.equals("")) {
			palindromicStr = "none";
		}
	    // code goes here  
	    return palindromicStr;
 }
	
	public static boolean isPalindromic(String str) {
		
		char[] charArray = str.toCharArray();
		
		char[] charArrayReverse = new char[str.length()];
		
		int cont = 0;
		for(int i= charArray.length - 1; i >=0; i--) {
			charArrayReverse[cont] = charArray[i];
			cont++;
		}
		
		if(new String(charArrayReverse).equals(str)) {
			return true;
		}
		
		return false;
	}

}
