import java.util.HashMap;
import java.util.Map;
public class TwoSum {
	public static int[] findTwoSum(int[] list, int sum) {
		if(list == null || list.length<2 || sum<1)
			return null;
		final Map<Integer, Integer> mapIndex = new HashMap<>();
		for(int i=0; i<list.length; i++) {
			int needed = sum-list[i];
			if(mapIndex.get(needed) != null) {
				return new int[] {i, mapIndex.get(needed)};
			}
			mapIndex.put(list[i], i);
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		int[] indices = findTwoSum(new int[] {3,1,5,7,5,9},10);
		if(indices != null) {
			System.out.println(indices[0]+" "+indices[1]);
		}
	}

}
