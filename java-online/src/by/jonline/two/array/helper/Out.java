package by.jonline.two.array.helper;

public abstract class Out {
	
	    // printing array
		public static void printWithSpaces(int array[]){
			int maxIntLenght;
			maxIntLenght = findMaxLength(array);
			String resolution = "%" + maxIntLenght + "d ";
			
			for (int x : array) {
				System.out.printf(resolution, x);
			}
			System.out.println("");
		}
		
		public static void printWithSpaces(int array[], int maxIntLenght){
			
			String resolution = "%" + maxIntLenght + "d ";
			
			for (int x : array) {
				System.out.printf(resolution, x);
			}
			System.out.println("");
		}
		
		// printing array
		public static void print(double array[]){
			for (double x : array) {
				System.out.print(x);
			}
			System.out.println("");
		}
		
		public static void printWithSpaces(double array[], int resolution){
			
			int maxLenght;
			maxLenght = findMaxLength(array);
			
			String r = "%" + (maxLenght + 1 + resolution) + "." + resolution + "f";
			for (double x : array) {
				System.out.format(r + " ", x);
			}
			
			System.out.println("");
		}
		
		public static void printWithSpaces(double array[][], int resolution){
			
			int maxLenght;
			maxLenght = findMaxLength(array);
			
			String r = "%" + (maxLenght + 1 + resolution) + "." + resolution + "f ";
			
			for (int i = 0; i < array.length; i++){
				for (int j = 0; j < array[0].length; j++){
					System.out.printf(r, array[i][j]);
				}
				System.out.println("");
			}
		}
		
		
		public static void print(int array[]){
			for (int x : array) {
				System.out.print(x + " ");
			}
			System.out.println("");
		}
		
		public static void print(double array[], int resolution){
			String r = "%." + resolution + "f ";
			for (double x : array) {
				System.out.printf(r, x);
			}
			System.out.println("");
		}
		
		// printing two dimensions array
		public static void printWithSpaces(int array[][]){
			
			int maxIntLenght;
			maxIntLenght = findMaxLength(array);

			for (int i = 0; i < array.length; i++){
				printWithSpaces(array[i], maxIntLenght);
			}
		}
		
		public static void printWithSpaces(int array[][], int maxIntLenght){
			
			for (int i = 0; i < array.length; i++){
				printWithSpaces(array[i], maxIntLenght);
			}
		}
		
		// printing three dimensions array
		public static void printWithSpaces(int array[][][]){
			for (int i = 0; i < array.length; i++){
				printWithSpaces(array[i]);
				System.out.println("");
			}
		}
		
		// prints column of two dimension array
		public static void printColumn(int array[][], int column){
			for (int i = 0; i < array.length; i++){
				System.out.println(array[i][column]);
				
				
			}
		}
		
		
		private static int findMaxLength(int array[]) {	

			int max;
			max = 0;
			
			for (int i : array) {
				int temp = lengthOfnum(i);
				if (temp > max) {
					max = temp;
				} 
			}
			
			return max;	
		}
		
		
		
		public static int findMaxLength(int array[][]) {	

			int max;
			max = 0;
			
			for (int i = 0; i < array.length; i++) {
				int temp = findMaxLength(array[i]);
				if (temp > max) {
					max = temp;
				} 
			}
			
			return max;	
		}
		

			
		private static int findMaxLength(double array[]) {	

			int max;
			max = 0;

			for (double i : array) {
				int temp = lengthOfnum(i);
				if (temp > max) {
					max = temp;
				} 
			}
			return max;	
		}
		
		private static int findMaxLength(double array[][]) {	

			int max;
			max = 0;

			for (int i = 0; i < array.length; i++) {
				int temp = findMaxLength(array[i]);
				if (temp > max) {
					max = temp;
				} 
			}
			return max;
		}
		
		
		
		
		private static int lengthOfnum(int num) {
			return String.valueOf(num).length();
		}
		
		
		
		private static int lengthOfnum(double num) {
			int lengh;
			lengh = 0;
			
			if (num < 0 && ((int) num) == 0) {
				lengh++;
			}
			lengh += String.valueOf((int) num).length();
			
			return lengh;
		}


}
