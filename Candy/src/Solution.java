
public class Solution {

	public int candy(int[] ratings) {
		int inputLength = ratings.length;
		
		if(inputLength==0) 
			System.exit(0);
		
		int[] count = new int[inputLength];
		
		int[] order = ratings;
		
		sort(order);
		
		for(int i=0; i<inputLength; i++){
		
			int j = order[i];
			
			if(i==0){
				count[j] = 1;
			}else{
				if(j<inputLength-1 || j > 0){
					
					
				}else{
					if(j==0){
						if(count[j+1]!=null){
							
						}
						
					}
					
				}
					
			}
		}
		
		return 0;
        
    }
	public void sort(int[] a) {
		int temp = 0;
		for (int i = a.length - 1; i > 0; --i) {
		   for (int j = 0; j < i; ++j) {
		      if (a[j + 1] < a[j]) {
		        temp = a[j];
		        a[j] = a[j + 1];
		        a[j + 1] = temp;
		        }
		      }
		    }
		  }
		
}
