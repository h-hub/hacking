import java.util.Arrays;

class InsertionSort{
		
	public static void main(String []args){
		
		int[] originalArray = {2,6,4,8,6,2,4,3,9,1,1};
		
		insertionSortImperative(originalArray);
		
	}
	
	public static void insertionSortImperative(int[] input) {
		for (int i = 1; i < input.length; i++) { 
			int key = input[i]; 
			int j = i - 1;
			while (j >= 0 && input[j] > key) {
				input[j + 1] = input[j];
				j = j - 1;
			}
			input[j + 1] = key; 
		}
		
		System.out.println(Arrays.toString(input));
	}	
	
}
