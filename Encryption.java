import java.lang.Math;
import java.util.Arrays;
import java.util.*;

class Encryption{
		
	public static void main(String []args){
		
		String s = "ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots";
		char[] chars = s.toCharArray();
		List<Character> outPut = new ArrayList<Character>(); 
		
		double hAndW = s.length();
		double sqrt = Math.sqrt(hAndW);
		
		int height = (int)Math.ceil(Math.sqrt(hAndW));
		int width = (int)Math.floor(Math.sqrt(hAndW));
		
		System.out.println(Math.sqrt(hAndW));
		
		System.out.println(width);
		System.out.println(height);
		
		char sentece[][] = new char[width][height];
		int k=0;
		int j=0;
		
		for(int i=0; i< s.length(); i++){
		
			sentece[k][j] = chars[i];
			j++;
			if( ((i+1) % height) == 0){
				k++;
				j=0;
			}
		}
		
		k=0;
		j=0;
		
		for(int i=0; i< (height*width); i++){

			outPut.add(sentece[k][j]);
			
			k++;
			if( ((i+1) % width) == 0){
				j++;
				k=0;
				outPut.add(' ');
			}
		}
		
		
		
		System.out.println(Arrays.deepToString(sentece));
		
		outPut.forEach(System.out::print);
	}
	
}
