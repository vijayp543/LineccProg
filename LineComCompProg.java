package com.bridgelabz;


import java.util.Scanner;

public class LineComCompProg {

	public static void main(String[] args) {

		
		
		System.out.println("Welcome to Line"
				+ "Comparison Computation"
				+ "Program on Master Branch");
		
			
		Scanner scanner = new Scanner(System.in);

		// Input first point
		System.out.println("Enter coordinates of first point (x1, y1):");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();

		// Input second point
		System.out.println("Enter coordinates of second point (x2, y2):");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();

		// Calculate length of the line
		double length = calculateLength(x1, y1, x2, y2);

		// Display the result
		System.out.println("Length of the line: " + length);

		scanner.close();
	}

	public static double calculateLength(double x1, double y1, double x2, double y2) {
		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return length;
	}
	}


