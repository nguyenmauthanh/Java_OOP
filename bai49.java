package nmt.ptit;

import java.util.Scanner;

public class bai49 {
	
	
		
	public static void main(String[] args) {
		PhanSo1 p = new PhanSo1(1,1);
        p.nhap();
        p.rutGon();
        PhanSo1 p1 = new PhanSo1(1,1);
        p1.nhap();
        p1.rutGon();
        PhanSo1 p2 = new PhanSo1(1,1);
        p2 = p.congPS(p1);
        p2.rutGon();
        System.out.println(p2);

	}

}
class PhanSo1 {
	public static Scanner sc = new Scanner(System.in);
	 private long tuSo;
	 private long mauSo;
	
	 public PhanSo1() {
		
	}
	 
	private long UCLN(long a, long b) {
		long r = a%b;
		while(r != 0) {
			a = b;
			b = r;
			r = a%b;
		}
		return b;
	}
	public void rutGon() {
		long x = UCLN(tuSo,mauSo);
		tuSo /= x;
		mauSo /= x;
		
	}

	public PhanSo1(long tuSo, long mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	// nhap phan so
	 public void nhap() {
		 long a = sc.nextLong();
		 long b = sc.nextLong();
		 tuSo = a;
		 mauSo= b;
	 }
	 public PhanSo1 congPS(PhanSo1 p) {
		 long a = tuSo*p.mauSo+mauSo*p.tuSo;
		 long b = mauSo*p.mauSo;
		 return new PhanSo1(a,b);
	 }
	@Override
	public String toString() {
		return tuSo + "/" + mauSo;
	}
	 
 }
