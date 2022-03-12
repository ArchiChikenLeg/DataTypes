package DataTypes;

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		double sum = in.nextDouble();
		sum += in.nextDouble();
		double c = in.nextDouble();
		
		if(sum == c)
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();
	}
}


