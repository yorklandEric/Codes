import java.util.HashMap;
import java.util.Map.Entry;



public class Solution {
	public static void main(String [] args){
		/*Input: numbers={2, 7, 11, 15}, target=9
		Output: index1=1, index2=2*/
		
		/*int[] numbers = new int[10000];
		for(int i=0; i<10000; i++){
			numbers[i] = i; 
		}*/
		
		int[] numbers = {0, 7, 11, 0};
		
		int[] result = new int[2];
		
		try{
			result = new Solution().twoSum(numbers,234);
		} catch(NullPointerException e){
			e.printStackTrace();
		}
		
		System.out.println("index1 = " + result[0] + " , " + " index2 = " + result[1]);
	}


	
	public int[] twoSum(int[] numbers, int target){
		
		if(numbers.length==0)
			return null;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int temp1 = 0, temp2 = 0;
		int location1 = 0, location2 = 0;
		int[] results = new int[2];
		
		for(int i=0, length=numbers.length; i<length; i++){
			map.put(numbers[i], i);
		}
		
		for(int i=0, length=numbers.length; i<length; i++){
			if(numbers[i]<=target){
				int diff = target - numbers[i];
				if(map.containsKey(diff)){
					if( (map.get(diff)+1) != i){
						location1 = map.get(diff)+1;
						location2 = i+1;
					}
					
				}
			}
		}
		
		
		 
		 System.out.println(location1 + " " + location2);
		 if(location1 < location2){
			 results[0] = location1;
			 results[1] = location2;
		 }
		 else{
			 results[0] = location2;
			 results[1] = location1;
		 }
		 
		
		 return results;
		
	}
}
