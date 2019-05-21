package Lambda;

import java.util.Arrays;

import java.util.*;

public class forEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values= Arrays.asList(2,3,4,5,6);
		
//		for (int i = 0; i < values.size(); i++) {
//			System.out.println(values.get(i));
//			
//		}
//		
//		for (int i : values){
//			System.out.println(i);
//			
//		}

		System.out.println("Hello World");
		values.forEach(i -> System.out.println(i));
	}

}
