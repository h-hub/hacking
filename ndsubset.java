import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Not tested
//Non-Divisible Subset

class ndsubset{
	
	public static void main(String []args){
	
		System.out.println("Test Java");
		
		int[] s = {1,7,2,4};
		int k = 3;
		Set<Integer> subSet = new HashSet<Integer>(); 
		
		for(int i=0; i < s.length; i++ ){
			for (int p=i+1; p < s.length; p++ ){
				System.out.println(s[i]+""+s[p]);
				if( (s[i]+s[p]) % 3 != 0){
					subSet.add(s[i]);
					subSet.add(s[p]);
				}
				
			}
		}
		
		Iterator<Integer> iterator = subSet.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+",");
		}
		
		System.out.print(subSet.);
	}
}
