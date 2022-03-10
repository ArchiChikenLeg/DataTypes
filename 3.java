package DataTypes;

import java.util.Scanner;

public class DataTypes {
	
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Point[] arr = new Point [n];
		
		for(int i = 0; i < n; i++)
			arr[i] = new Point(in.nextInt(), in.nextInt());

		int fInd = 0, sInd = 1;
		for(int i = 0; i < n; i++) {
			if(arr[fInd].dis > arr[i].dis) {
				sInd = fInd;
				fInd = i;
			}
		}
		System.out.println(Math.sqrt(Math.pow(arr[fInd].x - arr[sInd].x, 2) + Math.pow(arr[fInd].y - arr[sInd].y, 2)));
		in.close();
	}
}


