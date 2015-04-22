package solutions;

public class ReverseWords {

	public String reverseWords(String s){
		String sArray[]=s.split(" ");
		String result = new String("");
		
		if(sArray.length <= 1) return s;
		else{
			for(int index = sArray.length; index>=0; index --){
				if(index==0) result = result + sArray[index];
				else{
					result =result + sArray[index]+" ";
				}				
			}	
		}
		return result;
	}
}
