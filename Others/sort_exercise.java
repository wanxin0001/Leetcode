import java.util.*;
public class sort_exercise {
	public static void main(String[] args) {
		array_sort();
	}



	//First Method: Sort an array
	//Use Arrays.sort()
	//the order is 	Apple Pineapple banana orange

	public static void array_sort(){
		String[] fruits = new String[]{"Pineapple","Apple","orange","banana"};
		Arrays.sort(fruits);

		int i = 0;
		for(String tmp : fruits) {
			System.out.println(tmp);
		}
	}


	//Second Method: Sort an ArrayList
	//By use Collections.sort()
	public static void arrayList_sort(){
		List<String> fruits = new ArrayList<String>();

		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");

		Collections.sort(fruits);

		for(String tmp : fruits){
			System.out.println(tmp);
		}
	}
}