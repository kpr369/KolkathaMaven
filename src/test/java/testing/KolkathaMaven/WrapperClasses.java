package testing.KolkathaMaven;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		Integer i = a; // AutoBoxing
		
		int b = i; //Unboxing
		
		System.out.println(b);
		
		
		List<Integer> list = new ArrayList();
		
		list.add(2);
		list.add(3);
		
		int ii = 4;
		
		list.add(ii);
	}

}
