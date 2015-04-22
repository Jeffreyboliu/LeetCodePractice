package solutions;
import java.util.*;

public class PascalTriangle2 {

	public List<Integer> getRow(int rowIndex){
		
		List<Integer> row = new ArrayList<Integer>();
		if(rowIndex<0) return row;
		else if(rowIndex==0){ 
			row.add(1);
			return row;
		}
		else if(rowIndex==1){
			row.add(1);
			row.add(1);
			return row;
		}
		
		row.add(1);
		row.add(1);
		
		return getRowHelper(rowIndex, row);
	}	 
	
	private List<Integer> getRowHelper(int rowIndex, List<Integer>row){	
		System.out.println("in Helper");
		if(rowIndex == row.size()-1) return row;	
		ArrayList<Integer> res = new ArrayList<Integer>();	
		//The actual index in the arraylist is counter-1
		res.add(1);	
		System.out.print("1,");
			for(int eleCounter = 1; eleCounter < row.size(); eleCounter++){
				int addEle = row.get(eleCounter-1)+row.get(eleCounter);		
				res.add(addEle);
				System.out.print(addEle+",");
			}	
		res.add(1);
		System.out.println("1");
		return getRowHelper(rowIndex,res);
		
	}	
}
