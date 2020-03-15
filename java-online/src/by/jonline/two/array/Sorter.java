package by.jonline.two.array;

public abstract class Sorter {
	
	// sorting down arrays
		public static void sortDownArr(int array[]){
			for (int i = array.length; i > 0; i--){
				for(int j = 1; j < i; j++){
					if (array[j] > array[j-1]){
						int temp = array[j];
						array[j] = array[j-1];
						array[j-1] = temp;
					}
				}			
			}
		}
		
		public static void sortDownArr(double array[]){
			for (int i = array.length; i > 0; i--){
				for(int j = 1; j < i; j++){
					if (array[j] > array[j-1]){
						double temp = array[j];
						array[j] = array[j-1];
						array[j-1] = temp;
					}
				}			
			}
		}
		
		// sorting down two dimensions arrays row
		public static void sortRowDownArr(int array[][]){
			for (int i = 0; i < array.length; i++){
				sortDownArr(array[i]);
			}
		}
		
		// sorting up array
		public static void sortUpArr(int array[]){
			for (int i = array.length; i > 0; i--){
				for(int j = 1; j < i; j++){
					if (array[j] < array[j-1]){
						int temp = array[j];
						array[j] = array[j-1];
						array[j-1] = temp;
					}
				}			
			}
		}
		
		public static void sortUpArr(double array[]){
			for (int i = array.length; i > 0; i--){
				for(int j = 1; j < i; j++){
					if (array[j] < array[j-1]){
						double temp = array[j];
						array[j] = array[j-1];
						array[j-1] = temp;
					}
				}			
			}
		}
		
		// sorting up two dimensions arrays row
		public static void sortRowUpArr(int array[][]){
			for (int i = 0; i < array.length; i++){
				sortUpArr(array[i]);
			}
		}
		// sorting down two dimensions arrays column
		public static void sortColumnDownArr(int array[][]) {	
			for (int i = 0; i < array[0].length; i++){
				for (int j = array.length; j > 0; j--){
					for (int k = 1; k < j; k++)
						if (array[k][i] > array[k-1][i]){
							int temp = array[k][i];
							array[k][i] = array[k-1][i];
							array[k-1][i] = temp;
						}
				}
			}
		}
		
		// sorting up two dimensions arrays column
		public static void sortColumnUpArr(int array[][]) {	
			for (int i = 0; i < array[0].length; i++){
				for (int j = array.length; j > 0; j--){
					for (int k = 1; k < j; k++)
						if (array[k][i] < array[k-1][i]){
							int temp = array[k][i];
							array[k][i] = array[k-1][i];
							array[k-1][i] = temp;
						}
				}
			}
		}

}
