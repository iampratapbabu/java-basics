package project1.collections;

import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = List.of("Apple","Bat","Cat");
		//list is immutable that is we cannot add more items to list or assign other item inplace of pervious one
		System.out.println(words.size());
		System.out.println(words);
		System.out.println(words.get(1));
		
		

		
		
		

	}

}
