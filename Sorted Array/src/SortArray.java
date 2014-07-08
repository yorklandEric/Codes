

public class SortArray {
	public static void main(String[] args){
		
		int[] A = {0,1,2,3,4,5,6,7,8};
		
		int loc = new SortArray().search(A,2);
		System.out.println(loc);
	}
	
	public int search(int[] A, int target){
		int location = -1;
		
		for(int i=0; i<A.length; i++){
			if(target==A[i]){
				location = i;
			}
		}
		
		return location;
		
	}
		
		
}
