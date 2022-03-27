package Tets;

import java.util.Scanner;

public class TamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao do dai cac canh cua hinh tam giac");
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("Nhap vao do dai canh ben: ");
		double a = scan.nextDouble();
		System.out.printf("Nhap vao do dai canh ben: ");
		double b = scan.nextDouble();
		System.out.printf("Nhap vao do dai canh day: ");
		double c = scan.nextDouble(); //cd canh day
		
		
		double  P = (a + b + c) / 2;
		if(a <= 0 || b <= 0 || c <= 0){
			System.out.println("vui long nhap vao do dai chinh xac");
		} else if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b) {
			System.out.println("Day la tam giac vuong");
			double Svuong = (a*b) / 2; 
			double Pvuong = a + b + c;
			System.out.println("Dien tich tam giac vuong la:" +Svuong);
			System.out.println("Dien tich tam giac vuong la:" +Pvuong);
		} else if(a==b && b==c) {
			System.out.println("Day la tam giac deu");
			System.out.printf("Nhap vao do dai chieu cao: ");
			double h = scan.nextDouble();
			double Pdeu = a*a*a; 
			double Sdeu = (a*h) / 2;
			System.out.println("Dien tich tam giac deu la:" + Sdeu);
			System.out.println("Dien tich tam giac deu la:" + Pdeu);
		}else if(a==b || a==c || b==c) {
			System.out.println("Nhap vao chieu cao");
			System.out.printf("Nhap vao do dai chieu cao: ");
			double h = scan.nextDouble();
			double Pcan = (a + b + c);
			double Scan = (a*h) / 2;
            System.out.println("Day la tam giac can");
            System.out.println("Dien tich tam giac can la:" +Pcan);
			System.out.println("Dien tich tam giac can la:" +Scan);
		}else{
			System.out.println("Day la tam giac nhon");
			//Chu vi
			double chuVi = P * 2;
			System.out.println("Chu vi tam giac la:" + chuVi);
			// tinh dien tich
			double S = Math.sqrt(P*(P-a)*(P-b)*(P-c));
			System.out.println("Dien tich tam giac la: " + S);
		}
		
	}

}
