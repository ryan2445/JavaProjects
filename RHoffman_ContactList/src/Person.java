//Ryan Hoffman
//AP Java Period 5
import java.util.*;
public class Person {
	private String name;
	private int number;
	private String email;
	
	public Person(){
		
	}
	public Person(String name, int number, String email){
		this.name = name;
		this.number = number;
		this.email = email;
	}
	public String getName(){
		return name;
	}
	public int getNumber(){
		return number;
	}
	public String getEmail(){
		return email;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String toString(){
		return "Name: "+name+"\nNumber: "+number+"\nEmail: "+email;
	}
	
	
	
	
	
	
	
	
	
	
}
