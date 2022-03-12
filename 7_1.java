package DataTypes;

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		double X = in.nextDouble();
		double Y = in.nextDouble();
		double Z = in.nextDouble();
		
		int n = in.nextInt();
		double ABCQ[][] = new double[n][4];
		for(int i = 0; i < n; i++) {
			ABCQ[i][0] = in.nextDouble();
			ABCQ[i][1] = in.nextDouble();
			ABCQ[i][2] = in.nextDouble();
			ABCQ[i][3] = in.nextDouble();
		}
		
		double A = 0, B = 0, C = 0;
		for(int i = 0; i < n; i++) {
			A+=ABCQ[i][0]*ABCQ[i][3];
			B+=ABCQ[i][1]*ABCQ[i][3];
			C+=ABCQ[i][2]*ABCQ[i][3];
		}
		
		if(X == A && Y == B && Z == C)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		in.close();
	}
}


