package nmt.ptit;

import java.util.Scanner;

public class bai36 {
	
	
		
	public static void main(String[] args) {
		PhanSo p = new PhanSo(1,1);
        p.nhap();
        p.rutGon();
        System.out.println(p);

	}

}
class PhanSo {
	public static Scanner sc = new Scanner(System.in);
	 private long tuSo;
	 private long mauSo;
	
	 public PhanSo() {
		
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

	public PhanSo(long tuSo, long mauSo) {
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

	@Override
	public String toString() {
		return tuSo + "/" + mauSo;
	}
	 
 }
