import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MyClass {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		
		Collections.sort(cars);
		for(String i:cars) {
			System.out.println(i);
		}
		
		ArrayList<Integer> myNum = new ArrayList<Integer>();
		myNum.add(10);
		myNum.add(15);
		myNum.add(20);
		myNum.add(25);
		Collections.sort(myNum);
		for(int i:myNum) {
			System.out.println(i);
		}
		
		HashMap<String, String> capital = new HashMap<String,String>();
		capital.put("England","London");
		capital.put("Germany", "Berlin");
		capital.put("Sudan", "Khartoum");
		System.out.println(capital);
		
		for(String i:capital.keySet()) {
			System.out.println(i);
		}
		
		for(String i:capital.values()) {
			System.out.println(i);
		}
		Integer myInt = 100;
		String myString = myInt.toString();
		System.out.println(myString.length());
	}
}