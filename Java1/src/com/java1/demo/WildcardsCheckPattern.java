package com.model.lab;

//Coderbyte Wildcards problem +*$

public class WildcardsCheckPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkSamePattern("+++++ abcdehhhhhh"));
		
		System.out.println(checkSamePattern("+++++* abcdehhhhhh"));
		
		System.out.println(checkSamePattern("$**+*{2} 9mmmrrrkbb"));
	}
	
	public static boolean checkSamePattern(String phrase) {
		
		String[] words = phrase.split(" ");
		
		char[] array1 = words[0].toCharArray();
		
		char[] array2 = words[1].toCharArray();
		
		int length = array1.length;
		
//		List<Character> listChar;
		
		int pos1 = 0;
		int pos2 = 0;
		for(int i=0; i<= array1.length ; i++) {
			
			if(pos1>=array1.length && pos2 < array2.length-1) {
				return false;
			}
			
			if(pos1 == array1.length) {
				break;
			}
			
			if(array1[pos1]== '+') {
				if(!Character.isLetter(array2[pos2])) {
					return false;
				}
				pos1++;
				pos2++;
			}
			else if(array1[pos1] == '$') {
				if(!Character.isDigit(array2[pos2])) {
					return false;
				}
				pos1++;
				pos2++;
			}
			else if(array1[pos1] == '*' &&  (pos1+1>=array1.length || array1[pos1+1]!='{')){
				
				char test = ' ';
				for(int j=pos2; j<= pos2+2; j++) {
					
					if(test==' ') {
						test = array2[j];
					}
					else if(test!= array2[j]){
						return false;
					}
				}
				
				pos1++;
				pos2+=3;
			}
			//*{N}
			else {
				
				int N = Character.getNumericValue( array1[pos1+2]);
				
				char test = ' ';
				for(int j=pos2; j<= pos2+N-1; j++) {
					
					if(test==' ') {
						test = array2[j];
					}
					else if(test!= array2[j]){
						return false;
					}
				}
				
				pos1+=4;
				pos2+=N;
			}
		}
	
		
		return true;
	}

}
