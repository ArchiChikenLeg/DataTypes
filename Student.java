package DataTypes;

public class Student {
	public String name;
	public String surname;
	public int math;
	public int fiz;
	public int inf;
	public double av;
	
	Student(String n, String s, int m, int f, int i){
		name = n;
		surname = s;
		math = m;
		fiz = f;
		inf = i;
		av = (math + fiz + inf)/3.0;
	}
}
