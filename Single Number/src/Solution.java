import java.util.HashMap;
import java.util.Map.Entry;


public class Solution {
	public static void main(String[] args){
		int[] numbers = {1,2,1,4,5,6,5,2,6};
		System.out.println(new Solution().singleNumber(numbers));
	}
	
	public int singleNumber(int[] A) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

		int output = 0;
		
		for(int i=0, length=A.length; i<length; i++){
			if(map.containsKey(A[i])){
				map.put(A[i], map.get(A[i])+1);
			}else{
				map.put(A[i], 1);
			}
		}
		
		if(map.containsValue(1)){
			for(Entry<Integer,Integer> entry : map.entrySet()){
				if(entry.getValue().equals(1)){
					output = entry.getKey();
				}
			}
		}
		return output;
    }
}
