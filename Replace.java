package assign;

import java.io.*;
import java.util.*;

public class Replace {

	public static void main(String[] args) {		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
	      list.add("B");
	      list.add("C");
	      list.add("D");
	      
	      System.out.println("old list : " +list);

	      list.set(2, "E");
	      System.out.println("updated list : " +list);

		
	}

}
