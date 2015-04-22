package solutions;
//backtracking algorithm

//it takes O(m+n/m) time and O(m+n) space

public class UniquePaths1 {

	public int uniquePaths(int m, int n){
		
			return backtrack(0,0,m,n);
	}
	
	private int backtrack(int r, int c, int m, int n){
		
		// if we find the destination
		if(r==m-1 && c==n-1){
			return 1;
		}
		//if out of bound
		if(r>=m || c>= n){
			return 0;
		}
		
		//at every step we have two choices either r+1 or c+1
		return backtrack(r+1,c,m,n)+backtrack(r,c+1,m,n);
		
	}
	
	
}
