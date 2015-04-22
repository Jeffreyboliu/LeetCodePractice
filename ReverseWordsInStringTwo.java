package solutions;
import java.util.*;

public class ReverseWordsInStringTwo {
	public void reverseWords(char[] s){
		if(s.length<=1) return;
		if(!String.valueOf(s).contains(" ")) return;
		
		reverse(s,0,s.length-1);
		System.out.println("checking words of s ="+String.valueOf(s));
		for(int i = 0, j = 0; j < s.length; j++){
			if(j==s.length-1 || s[j+1]==' '){
				System.out.println("i="+i+" j="+j+" s="+String.valueOf(s));
				reverse(s,i,j);
				i=j+2;
				System.out.println("new i="+i);
				System.out.println("=======================");
			}
		}	
	}
	
	//reverse the s array
	private void reverse(char[] s, int begin, int end){
		System.out.println("Reversing: "+String.valueOf(s)+" begin="+begin+" end="+end);
		for(int i = begin; i<=begin+(end-begin)/2; i++){
			System.out.println("i="+i+" start="+begin+" end="+end);
			char temp = s[i];
			System.out.println("Changing: "+s[i]+":"+s[end-i]);
			s[i] = s[end + begin- i];
			s[end - i+begin] = temp;
			System.out.println("Changed: "+String.valueOf(s));
		}
		System.out.println("reversed string ="+String.valueOf(s));
	}
}
