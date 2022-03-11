package DataTypes;

import java.util.Scanner;

public class DataTypes {
	
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Point[] arr = new Point [n];
		
		for(int i = 0; i < n; i++)
			arr[i] = new Point(in.nextInt(), in.nextInt());

		double cX = 0;
		double cY = 0;
		for(int i = 0; i < n; i++) {
			cX += arr[i].X();
			cY += arr[i].Y();
		}
		
		System.out.println(cX/(double)n + " " + cY/(double)n);
		in.close();
	}
}


