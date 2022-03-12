package DataTypes;

import java.util.Scanner;
import java.util.TreeSet;

public class DataTypes {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String set1 = in.nextLine();
		String set2 = in.nextLine();
		TreeSet<Character> common = new TreeSet<Character>();
		for(int i = 0; i < set1.length(); i++) {
			for(int j = 0; j < set2.length(); j++) {
				if(set1.charAt(i)==set2.charAt(j) && set1.charAt(i)!= ' ')
					common.add(set1.charAt(i));
			}
		}
		
		for (Character value : common)
            System.out.print(value + " ");
		in.close();
	}
}


