package DataTypes;

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Student[] arr = new Student [n];
		for(int i = 0; i < n; i++) 
			arr[i] = new Student(in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt());
		
		double math = 0, fiz = 0, inf = 0;
		for(int i = 0; i < n; i++) {
			math += arr[i].math;
			fiz += arr[i].fiz;
			inf += arr[i].inf;
		}
		
		System.out.println(math/n + " " + fiz/n + " " + inf/n);
		in.close();
	}
}


