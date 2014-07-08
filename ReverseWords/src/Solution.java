
public class Solution {
	
	public static void main(String[] args){
		Solution s = new Solution();
		String str = " str        str1";
		System.out.println(s.reverseWord(str));
	}
	
	public String reverseWord(String s){
		String outputStr = " ";
		
		if(s.isEmpty()||"".equals(s)){
			return outputStr;
		
		}
			
		String inputStr = s.trim();
		String[] newStr = inputStr.split(" "); //transfer string to string array
		
		
		int len = newStr.length;
	
		
		for(int i=len-1; i>=0; i--){
			if(!newStr[i].isEmpty()){
				outputStr = outputStr + " " + newStr[i].trim();
			}
			 
		}
		
		return outputStr.trim();
		
	}

}
