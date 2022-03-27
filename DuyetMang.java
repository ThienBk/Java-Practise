package Tets;

import java.util.Scanner;

public class DuyetMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{	
			java.lang.String mang;
			
		      Scanner sc = new Scanner(System.in);

		      System.out.println("Nhap vao phan tu vao mang:  ");
		      mang = sc.nextLine();

		      if(mang.matches("^[A-Z][^\\s]{0,20}\\d$"))
		         System.out.println("Duyet");
		      else
		         System.out.println("Khong duyet");
		   }
	}

}
