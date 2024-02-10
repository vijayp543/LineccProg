package com.bridgelabz;


public class LineComCompProg {
	private double x1, y1, x2, y2;
	public LineComCompProg(double x1, double y1, double x2, double y2) {
	    this.x1 = x1;
	    this.y1 = y1;
	    this.x2 = x2;
	    this.y2 = y2;
	}
	
	double length ;
	
	
	public double calculateLength() {

		 length =	  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		
		return length ;
	}
	

	
	
	 public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        LineComCompProg other = (LineComCompProg) obj;
	        return Double.compare(other.calculateLength(), this.calculateLength()) == 0;
	    }

	

	public static void main(String[] args) {

		
		
		System.out.println("Welcome to Line"
				+ "Comparison Computation"
				+ "Program on Master Branch");
		
		System.out.println("UC1");
	//	----------------------------    UC1  -------------------------------------
		
		LineComCompProg lccp = new LineComCompProg(8.8,2.2,5.8,5.9);
		lccp.calculateLength();
		
		System.out.println("Length of the line: " + lccp.length);
		
		System.out.println("UC2");
		//	----------------------------    UC2  -------------------------------------

		
		 LineComCompProg length1 = new LineComCompProg(0, 0, 3, 4);
		 LineComCompProg length2 = new LineComCompProg(1, 1, 4, 5);
		 LineComCompProg length3 = new LineComCompProg(0, 0, 3, 4);

	        System.out.println("Length 1: " + length1.calculateLength());
	        System.out.println("Length 2: " + length2.calculateLength());
	        System.out.println("Length 3: " + length3.calculateLength());

	        System.out.println("Are length1 and length2 equal? " + length1.equals(length2));
	        System.out.println("Are length1 and length3 equal? " + length1.equals(length3));
	    }
		
}


	
		
	