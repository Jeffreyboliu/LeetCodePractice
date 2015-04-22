package solutions;

public class StrStr {

    public int strStr(String haystack, String needle) {
        
        
        if(needle.length()==0 || haystack==needle){
        	System.out.println("condition 1");
             return 0;
        }
        
        if(needle.length()>haystack.length()) return -1;
        
        for(int i=0; i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0) && (haystack.length()-i)>needle.length()){
            int n = i;
            for(int j=0; j<needle.length(); j++){
                if(haystack.charAt(n)!=needle.charAt(j)){
                    break;
                }
                n++;
            }
            if ((n-i)==needle.length()) return i;
            }
        }
        return -1;
        
    }
	
}
