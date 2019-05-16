import java.util.Arrays;

class Solution1{
		
	public static void main(String []args){
		
		int[] sums = {2,1,1,0,1};
		
		System.out.println( solution(3, 2, sums) );
		
		int[] sums2 = {0,0,1,1,2};
		System.out.println( solution(2, 3, sums2) );
		
		int[] sums3 = {2,0,2,0};
		System.out.println( solution(2, 2, sums3) );

	
	}
	
	public static String solution(int u, int l, int[] c){
		
		int[][] m = new int[2][c.length];
		
		for(int i =0; i< c.length; i++){
			//System.out.println();
			//System.out.println("u and l -> "+u+","+l);
		
			if(u==0 && l==0){
				break;
			}
			//System.out.println(c[i]==2 && u>0 && l>0);
			if(c[i]==2 & u>0 & l>0){
				m[0][i] = 1;
				m[1][i] = 1;
				u--;
				l--;
				//System.out.println("c[i]==2");
				//System.out.println("u and l == "+u+","+l);
			}
			
			if (c[i]==0){
				m[0][i] = 0;
				m[1][i] = 0;
				//System.out.println("c[i]==0");
				//System.out.println("u and l == "+u+","+l);
			}
			
			if(c[i]==1){
				if(u>0){
					m[0][i] = 1;
					m[1][i] = 0;
					u--;
				} else if (l>0){
					m[0][i] = 0;
					m[1][i] = 1;
					l--;
				}
				//System.out.println("c[i]==1");
				//System.out.println("u and l == "+u+","+l);
			}
		}
        //System.out.println(Arrays.deepToString(m));
		if(u==0 & l==0) return Arrays.deepToString(m);
		return "IMPOSSIBLE";
	}
	
	
}
