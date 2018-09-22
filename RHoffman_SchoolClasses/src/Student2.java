import java.util.*;
public class Student2 {
	private int id, gpa, classes;
	private String fname, lname;

	public void Student(int idInit, int gpaInit, int classesInit, String fnameInit, String lnameInit){
		id = idInit;
		gpa = gpaInit;
		classes = classesInit;
		fname = fnameInit;
		lname = lnameInit;
	}
	
	public int getId(){
		return id;
	}
	public int getGpa(){
		return gpa;
	}
	public int getClasses(){
		return classes;
	}
	public String getFname(){
		return fname;
	}
	public String getLname(){
		return lname;
	}
	
	public void setId(int idUpdate){
		id = idUpdate;
	}
	public void setGpa(int gpaUpdate){
		gpa = gpaUpdate;
	}
	public void setClasses(int classesUpdate){
		classes = classesUpdate;
	}
	public void setFname(String fnameUpdate){
		fname = fnameUpdate;
	}
	public void setLname(String lnameUpdate){
		lname = lnameUpdate;
	}
	public void askGrades(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your grade in your 1st class: ");
		String grade1 = scan.next();
		System.out.print("Enter your grade in your 2st class: ");
		String grade2 = scan.next();
		System.out.print("Enter your grade in your 3st class: ");
		String grade3 = scan.next();
		System.out.print("Enter your grade in your 4st class: ");
		String grade4 = scan.next();
		System.out.print("Enter your grade in your 5st class: ");
		String grade5 = scan.next();
		System.out.print("Enter your grade in your 6st class: ");
		String grade6 = scan.next();
	}
	public String toString(){
		return "Student Information:\n First Name: "+fname+"\nLast Name: "+lname+"\nID: "+id+"\nGPA: "+gpa+"\nClasses: "+classes;
	}
}