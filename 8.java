package DataTypes;

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Student[] arr = new Student [n];
		for(int i = 0; i < n; i++) 
			arr[i] = new Student(in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt());
		
		int maxInd = 0;
		for(int i = 0; i < n; i++) {
			if(arr[maxInd].av < arr[i].av)
				maxInd = i;
		}
		
		System.out.println(arr[maxInd].name + " " + arr[maxInd].surname);
		in.close();
	}
}


