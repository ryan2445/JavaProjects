
public class BoxConstructor {
	//Author: Ryan Hoffman	Period: 5
	//Program: BoxConstructor.java  	Date: 11/2/2017 
	//Description: Make a program which can create a zero dimensional object, a line, a rectangle, or a box
	//--------------------------------------------------------------------------------
	//Declaring Instance Variables (length, width etc.)
	private int length, width, height;
	private String output;
	//Default Constructor, all values set to zero,
	public BoxConstructor() {
		output = "Box created";
	}
	//Constructor which creates a line
	public BoxConstructor(int a) {
		this(a,0,0);
		output = "Line created";
	}
	//Constructor which creates a rectangle	
	public BoxConstructor(int a, int b) {
		this(a,b,0);
		output = "Rectangle created";
	}
	//Constructor which creates a box
	public BoxConstructor(int a, int b, int c) {
		length = a;
		width = b;
		height = c;
		output = "Box created";
	}
	public String output() {
		return output;
	}
	
	
	
	
	
	
}
