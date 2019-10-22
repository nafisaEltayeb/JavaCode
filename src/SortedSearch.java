import java.util.Arrays;
public class SortedSearch {
	public static int countNumbers(int[] sortedArray, int lessThan) {
		int result = Arrays.binarySearch(sortedArray, lessThan);
		System.out.println(result);
		if(result < 0) {
			result=-(result+1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(SortedSearch.countNumbers(new int[]{1, 3, 5, 7 }, 4));
	}

}
