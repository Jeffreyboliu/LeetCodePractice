package solutions;
import java.util.*;
import java.lang.*;

public class ReverseWordsInString {
	
	public String reverseWords(String s){
	StringBuilder reversed = new StringBuilder();
	int j = s.length();
	for(int i = s.length()-1;i>=0;i--){
		if(s.charAt(i)==' '){
			j = i;
		}else if(i==0 || s.charAt(i-1)==' '){
			if(reversed.length()!=0){
				reversed.append(' ');
			}
			reversed.append(s.substring(i, j));
		}
	}
	
	return reversed.toString();	
	}
}
