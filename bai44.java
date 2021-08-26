package nmt.ptit;

import java.util.Scanner;

public class bai44 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String name = sc.nextLine();
		String age  = sc.nextLine();
		float m1 = sc.nextFloat();
		float m2 = sc.nextFloat();
		float m3 = sc.nextFloat();
		float tong = m1+m2+m3;
		sv name1 = new sv(name,age,m1,m2,m3, tong);
		
		System.out.println(name1);
	}

}

class sv {
	String name;
	String age;
	float m1;
	float m2;
	float m3;
	float tongDiem;

	public sv(String name, String age, float m1, float m2, float m3, float t) {
		this.name = name;
		this.age = age;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.tongDiem = t;
	}
	
	@Override
	public String toString() {
		return name + " " + age + " " + tongDiem;
	}
}