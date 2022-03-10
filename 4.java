package DataTypes;

import java.util.Scanner;

public class DataTypes {
	
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Point[] arr = new Point [n];
		
		for(int i = 0; i < n; i++)
			arr[i] = new Point(in.nextInt(), in.nextInt());

		for(int i = 0; i < n-1; i++) {
			for(int j = i; j < n-i-1; j++) {
				if(arr[j].dis > arr[j+1].dis) {
					Point tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int i = 0; i < n; i++)
			arr[i].print();
		in.close();
	}
}


