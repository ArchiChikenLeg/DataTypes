package DataTypes;

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int [n];
		int count = 0;
		boolean copy = false;
		for(int i = 0; i < n; i++) {
			int tmp = in.nextInt();
			for(int j = 0; j < count; j++) {
				if(tmp == arr[j])
					copy = true;
			}
			if(!copy) {
				arr[count] = tmp;
				count++;
			}
			copy = false;
		}
        
		System.out.println(count);
		in.close();
	}
}


