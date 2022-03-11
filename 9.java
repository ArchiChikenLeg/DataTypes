package DataTypes;

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Student[] arr = new Student [n];
		for(int i = 0; i < n; i++) 
			arr[i] = new Student(in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt());
		

        for (int i = 0; i < n-1; i++) {
        	for (int j = 0; j < n-i-1; j++) {
                if (arr[j].av < arr[j+1].av) {
                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        	}
        }
        
        for(int i = 0; i < n; i++)
        	System.out.println(arr[i].name + " " + arr[i].surname);
            
		in.close();
	}
}


