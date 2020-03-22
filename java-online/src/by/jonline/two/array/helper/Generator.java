package by.jonline.two.array.helper;

public abstract class Generator {
	
	
	
	public static int randomInt(int from, int to){
		
		return (int) (Math.random()*(to - from + 1))+from; 	
	}
	
	
	
	
	public static double randomDouble(double from, double to){
		
		return (Math.random()*(to - from + 1))+from; 	 		                                
	}
	
	
	
	
	public static int [] randomIntArray(int lenth, int from, int to){
		
		int array[];
		array = new int[lenth];
		
		for (int i = 0; i < array.length; i++){
			array[i] = randomInt(from,to);
		}
		
		return array;
	}
	
	
	
	
	public static int [][] twoDimArrayInt(int from, int to){
		
		int column;
		int row;
		
		column = randomInt(from,to);
		row = randomInt(from,to);
		
		return new int [row][column];
	}
	
	
	
	public static double [][] twoDimArrayDouble(int from, int to){
		
		int column;
		int row;
		
		column = randomInt(from,to);
		row = randomInt(from,to);
		
		return new double [row][column];
	}
	
	
	
	public static double [] randomDoubleArray(int lenth, double from, double to){
		
		double array[];
		array = new double[lenth];
		
		for (int i = 0; i < array.length; i++){
			array[i] = randomDouble(from,to);
		}
		
		return array;
	}
	
	
	// filling array random numbers from x to y
	public static void fill(int array[], int from, int to){
		for (int i = 0; i < array.length; i++){
			array[i] = randomInt(from,to);
		}
	}
	
	
	public static void fill(double array[], double from, double to){
		for (int i = 0; i < array.length; i++){
			array[i] = randomDouble(from,to);
		}
	}
		
	public static void fill(int array[][], int from, int to){
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				array[i][j] = randomInt(from,to);
			}
		}
	}
	

}
