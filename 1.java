package DataTypes;

import java.util.Scanner;

public class DataTypes {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int point[][] = new int [n][2];
		for(int i = 0; i < n; i++) {
			point[i][0] = in.nextInt();
			point[i][1] = in.nextInt();
		}
	
		int indOfMax = 0;
		for(int i =0; i < n; i++) {
			if(Math.sqrt(point[i][0]*point[i][0] + point[i][1]*point[i][1]) > Math.sqrt(point[indOfMax][0]*point[indOfMax][0] + point[indOfMax][1]*point[indOfMax][1]))
				indOfMax = i;
		}
		
		System.out.println(point[indOfMax][0] + " " + point[indOfMax][1]);
	}
}
