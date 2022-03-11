package DataTypes;

import java.util.Scanner;

public class DataTypes {
	
	static int fact(int n) {
		int res = 1;
		for(int i = 1; i <= n; i++)
			res*=i;
		return res;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Point[] arr = new Point [n];
		
		for(int i = 0; i < n; i++)
			arr[i] = new Point(in.nextInt(), in.nextInt());
		
		int qTr = (fact(n)/fact(n - 2))/2;
		
		double[] perArr = new double[qTr];
		int count = 0;
		for(int i = 0; i < n-1; i++) {
			for(int j = (i+2)%n; (j < n)&&(j != i); j++) {
				double sqr = 0.5*((arr[i].x - arr[j].x)*(arr[i+1].y - arr[j].y) - (arr[i+1].x - arr[j].x)*(arr[i].y - arr[j].y));
				perArr[count] = sqr;
				count++;
			}
		}
		
		int maxInd = 0;
		for(int i = 0; i < qTr; i++) {
			if(perArr[i] > perArr[maxInd])
				maxInd = i;
		}
		
		System.out.println(perArr[maxInd]);
		in.close();
	}
}


