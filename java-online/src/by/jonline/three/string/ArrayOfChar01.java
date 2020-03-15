package by.jonline.three.string;

import java.util.Arrays;

/*
 *  Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class ArrayOfChar01 {

	
	public static void main(String[] args) {

		String [] arr;
		
		arr = new String [] {"isTrue",
							 "speakFromMyHeart",
							 "oneWayTicket",
							 "goHome"};
		
		System.out.println(Arrays.toString(arr));
		

		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = cammelToSnake(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	private static String cammelToSnake (String word) {

		char [] x;
		x = word.toCharArray();
		x = cammelToSnake(x);
		
		word = charArrayToString(x);
		
		return word;
	}
	
	
	
	private static char[] cammelToSnake (char[] str) {
		for (int i = 0; i < str.length; i++) {
			if (Character.isUpperCase(str[i])) {
				replaseUpperCaseToLowerCase(str, i);
				str = addUnderscore(str, i);
			}
		}

		return str;
	}

	
	
	private static char[] addUnderscore(char[] str, int i) {
		char [] out;
		out = new char [str.length+1];
		for (int j = 0, k = 0; j < str.length; j++, k++) {
			
			if (j == i) {
				out[j] = '_';
				k++;
			}
			
			out[k] = str[j];
		}
		
		return out;
		
	}

	private static void replaseUpperCaseToLowerCase(char[] str, int i) {
		str[i] = Character.toLowerCase(str[i]);
	}
	
	
	
	private static String charArrayToString (char[] str) {
		String out;
		out = "";
		
		for (char i : str) {
			out += i;
			
		}
		
		return out;
	}
	
}

