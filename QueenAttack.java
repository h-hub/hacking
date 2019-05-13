import java.util.*;
import java.util.Objects;

//not finished
class QueenAttack{

	final static int size = 5;
	final static int rq = 4;
	final static int cq = 3;
		
	public static void main(String []args){
	
		int numOfSquares = 0;
		Iterator<Tuple> iterator; 
		
		List<Tuple> givenList = new ArrayList<Tuple>(); 
		givenList.add(new Tuple(5,5));
		givenList.add(new Tuple(4,2));
		givenList.add(new Tuple(2,3));
		
		System.out.println("Test Java");
		
		List<Tuple> set1 = getSet1();	
		
		iterator = set1.iterator();
		while(iterator.hasNext()){
			Tuple tmp = iterator.next();
			if(givenList.contains(tmp)){
				break;
			}
			numOfSquares++;
		}
		
		System.out.println("--------->");
		List<Tuple> set2 = getSet2();
		
		iterator = set2.iterator();
		while(iterator.hasNext()){
			Tuple tmp = iterator.next();
			if(givenList.contains(tmp)){
				break;
			}
			numOfSquares++;
		}
		
		System.out.println("--------->");
		List<Tuple> set3 = getSet3();
		
		iterator = set3.iterator();
		while(iterator.hasNext()){
			Tuple tmp = iterator.next();
			if(givenList.contains(tmp)){
				break;
			}
			numOfSquares++;
		}
		
		System.out.println("--------->");
		List<Tuple> set4 = getSet4();
		
		iterator = set4.iterator();
		while(iterator.hasNext()){
			Tuple tmp = iterator.next();
			if(givenList.contains(tmp)){
				break;
			}
			numOfSquares++;
		}
		
		System.out.println("--------->");
		List<Tuple> set5 = getSet5();
		
		iterator = set5.iterator();
		while(iterator.hasNext()){
			Tuple tmp = iterator.next();
			if(givenList.contains(tmp)){
				break;
			}
			numOfSquares++;
		}
		
		System.out.println("--------->");
		List<Tuple> set6 = getSet6();
		
		iterator = set6.iterator();
		while(iterator.hasNext()){
			Tuple tmp = iterator.next();
			if(givenList.contains(tmp)){
				break;
			}
			numOfSquares++;
		}
		
		System.out.println("--------->");
		List<Tuple> set7 = getSet7();
		
		iterator = set7.iterator();
		while(iterator.hasNext()){
			Tuple tmp = iterator.next();
			if(givenList.contains(tmp)){
				break;
			}
			numOfSquares++;
		}
		
		System.out.println("--------->");
		List<Tuple> set8 = getSet8();
		
		iterator = set8.iterator();
		while(iterator.hasNext()){
			Tuple tmp = iterator.next();
			if(givenList.contains(tmp)){
				break;
			}
			numOfSquares++;
		}
		
		System.out.println(numOfSquares);
	}
	
	public static List<Tuple> getSet1(){
		
		List<Tuple> set1 = new ArrayList<Tuple>(); 
		
		int newRq=rq+1;
		int newCq=cq-1;
		
		while(newRq!=size+1 && newCq!=size+1 && newRq!=0 && newCq!=0) {
			//System.out.println(newRq+" - "+newCq);
			set1.add(new Tuple(newRq,newCq));
			newRq = newRq+1;
			newCq = newCq-1;
		}
		return set1;
	}
	
	public static List<Tuple> getSet2(){
		
		List<Tuple> set1 = new ArrayList<Tuple>(); 
		
		int newRq=rq+1;
		int newCq=cq;
		
		while(newRq!=size+1 && newCq!=size+1 && newRq!=0 && newCq!=0) {
			//System.out.println(newRq+" - "+newCq);
			set1.add(new Tuple(newRq,newCq));
			newRq = newRq+1;
			newCq = newCq;
		}
		return set1;
	}
	
	public static List<Tuple> getSet3(){
		
		List<Tuple> set1 = new ArrayList<Tuple>(); 
		
		int newRq=rq+1;
		int newCq=cq+1;
		
		while(newRq!=size+1 && newCq!=size+1 && newRq!=0 && newCq!=0) {
			//System.out.println(newRq+" - "+newCq);
			set1.add(new Tuple(newRq,newCq));
			newRq = newRq+1;
			newCq = newCq+1;
		}
		return set1;
	}
	
	public static List<Tuple> getSet4(){
		
		List<Tuple> set1 = new ArrayList<Tuple>(); 
		
		int newRq=rq;
		int newCq=cq+1;
		
		while(newRq!=size+1 && newCq!=size+1 && newRq!=0 && newCq!=0) {
			//System.out.println(newRq+" - "+newCq);
			set1.add(new Tuple(newRq,newCq));
			newRq = newRq;
			newCq = newCq+1;
		}
		return set1;
	}
	
	public static List<Tuple> getSet5(){
		
		List<Tuple> set1 = new ArrayList<Tuple>(); 
		
		int newRq=rq-1;
		int newCq=cq+1;
		
		while(newRq!=size+1 && newCq!=size+1 && newRq!=0 && newCq!=0) {
			//System.out.println(newRq+" - "+newCq);
			set1.add(new Tuple(newRq,newCq));
			newRq = newRq-1;
			newCq = newCq+1;
		}
		return set1;
	}
	
	public static List<Tuple> getSet6(){
		
		List<Tuple> set1 = new ArrayList<Tuple>(); 
		
		int newRq=rq-1;
		int newCq=cq;
		
		while(newRq!=size+1 && newCq!=size+1 && newRq!=0 && newCq!=0) {
			//System.out.println(newRq+" - "+newCq);
			set1.add(new Tuple(newRq,newCq));
			newRq = newRq-1;
			newCq = newCq;
		}
		return set1;
	}
	
	public static List<Tuple> getSet7(){
		
		List<Tuple> set1 = new ArrayList<Tuple>(); 
		
		int newRq=rq-1;
		int newCq=cq-1;
		
		while(newRq!=size+1 && newCq!=size+1 && newRq!=0 && newCq!=0) {
			//System.out.println(newRq+" - "+newCq);
			set1.add(new Tuple(newRq,newCq));
			newRq = newRq-1;
			newCq = newCq-1;
		}
		return set1;
	}
	
	
	public static List<Tuple> getSet8(){
		
		List<Tuple> set1 = new ArrayList<Tuple>(); 
		
		int newRq=rq;
		int newCq=cq-1;
		
		while(newRq!=size+1 && newCq!=size+1 && newRq!=0 && newCq!=0) {
			//System.out.println(newRq+" - "+newCq);
			set1.add(new Tuple(newRq,newCq));
			newRq = newRq;
			newCq = newCq-1;
		}
		return set1;
	}

}

class Tuple{

	public int r;
	public int c;
	
	public Tuple(int r, int c){
		this.r = r;
		this.c = c;
	}
	
	public String toString(){
		return r+","+c;
	}
	
	@Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Tuple)) {
            return false;
        }

        Tuple tuple = (Tuple) o;

        return tuple.r == r && tuple.c == c;
    }
	
}

//https://webcache.googleusercontent.com/search?q=cache:S9SX1AAoOh0J:https://www.hackerrank.com/challenges/queens-attack-2+&cd=1&hl=en&ct=clnk&gl=sg
