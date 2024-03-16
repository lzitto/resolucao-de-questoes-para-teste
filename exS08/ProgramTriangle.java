package exS08;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class ProgramTriangle {
	public static void main(String[] args) {			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y, t01;
		x = new Triangle();
		y = new Triangle();
		t01 = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle t01: ");
		t01.a = sc.nextDouble();
		t01.b = sc.nextDouble();
		t01.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		double areaT01 = t01.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		System.out.printf("Triangle t01 area: %.4f%n", areaT01);
		
		if (areaX > areaY) {
		System.out.println("Larger area: X");
		}
		else {
		System.out.println("Larger area: Y");
		}
		sc.close();
	
	}

}
