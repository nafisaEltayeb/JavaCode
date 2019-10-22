import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
public class MergeNames {
	public static void main(String[] args) {
		String[] names1 = new String[] {"Eva","Emma","Olivia"};
		String[] names2 = new String[] {"Olivia","Sophia","Emma"};
		String[] names = mergeNames(names1,names2);
		for(String n:names) {
			System.out.print(" "+n);
		}
	}
	
	public static String[] mergeNames(String[] n1,String[] n2) {
		Set<String> mySet1 = new HashSet<String>(Arrays.asList(n1));
		Set<String> mySet2 = new HashSet<String>(Arrays.asList(n2));
		Set<String> unique =new HashSet<String>(mySet1);
		unique.addAll(mySet2);
		return unique.toArray(new String[unique.size()]);
	}

}
