package DataTypes;

import java.util.Scanner;
import java.util.HashSet;

public class DataTypes {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String set1 = in.nextLine();
		String set2 = in.nextLine();
		int count = 0;
		for(int i = 0; i < set1.length(); i++) {
			for(int j = 0; j < set2.length(); j++) {
				if(set1.charAt(i)==set2.charAt(j) && set1.charAt(i)!= ' ')
					count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}


