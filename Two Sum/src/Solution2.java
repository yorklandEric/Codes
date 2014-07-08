import java.util.HashMap;


public class Solution2 {

	public static void main(String [] args){
		/*Input: numbers={2, 7, 11, 15}, target=9
		Output: index1=1, index2=2*/
		
		int[] numbers = new int[10000];
		for(int i=0; i<10000; i++){
			numbers[i] = i; 
		}
		
		/*int[] numbers = {2, 7, 11, 15};*/
		
		int[] result = new int[2];
		
		try{
			result = new Solution().twoSum(numbers,12);
		} catch(NullPointerException e){
			e.printStackTrace();
		}
		
		System.out.println("index1 = " + result[0] + " , " + " index2 = " + result[1]);
	}
	
	public int[] twoSum(int[] numbers, int target) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    int[] resultVal = new int[2];
	    for(int i = 0; i < numbers.length; i ++) {
	        if(map.containsKey(numbers[i])) {
	            int index = map.get(numbers[i]);
	            System.out.println("index " + index);
	            if(index < i) {
	                resultVal[0] = index + 1;
	                resultVal[1] = i + 1;
	                
	            }
	        } 
	        if(!map.containsKey(numbers[i]))
	            map.put(target - numbers[i], i);
	    }

	    return resultVal; 
	}
}
