package DataTypes;

import java.util.Scanner;
import java.util.HashSet;

public class DataTypes {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashSet<Integer> mySet = new HashSet<Integer>();
		
		int tmpNum;
		for(int i = 0; i < n; i++) {
			String tmp = in.next();
			switch(tmp) {
			case "ADD":
				tmpNum = in.nextInt();
				mySet.add(tmpNum);
				break;
			case "COUNT":
				System.out.println(mySet.size());
				break;
			case "PRESENT":
				tmpNum = in.nextInt();
				if(mySet.contains(tmpNum))
					System.out.println("YES");
				else
					System.out.println("NO");
				break;
			}
		}
		in.close();
	}
}


