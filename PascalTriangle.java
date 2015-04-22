package solutions;
import java.util.*;

public class PascalTriangle {
	
	public List<List<Integer>> generate(int numRows){
		
		System.out.println(numRows);
		
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
				
		if(numRows < 1) return result;
		List<Integer> temp = new ArrayList<Integer>();
		
		temp.add(1);
		result.add(temp);
		
		if(numRows==1) return result;
		else if(numRows>=2){
		    List<Integer> temp2 = new ArrayList<Integer>();
		    temp2.add(1);
		    temp2.add(1);
		    result.add(temp2);
		    if(numRows==2)
		    return result;
		}
		//int counter = 1;//count the row. It represent the elements in the list
		
		for(int rowCount = 2; rowCount<numRows;rowCount++){
			System.out.println("Working on row = "+ rowCount);
			List<Integer> t = new ArrayList<Integer>();
			t.add(1);//first element is always 1. Same as last element
			
			for(int elementCount = 1; elementCount < rowCount; elementCount++){
				System.out.println("elementCount="+elementCount+" rowCount="+rowCount);
				int first=result.get(rowCount-1).get(elementCount-1);
				System.out.println("first="+first);
				int second = result.get(rowCount-1).get(elementCount);
				System.out.println("add "+ second);
				int total = first+second;
				System.out.println("total="+total);
				t.add(result.get(rowCount-1).get(elementCount-1)+result.get(rowCount-1).get(elementCount));
			}
			
			t.add(1);//last element is always 1
			result.add(t);
		}
		
		
		return result;
	}
	
	
}
