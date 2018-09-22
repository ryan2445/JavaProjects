import java.util.*;
public class Friend {
	private String name;
	private Homework homework;
	private Lunch lunch;
	
	public Friend(String name, Homework homework, Lunch lunch){
		this.name = name;
		this.homework = homework;
		this.lunch = lunch;
	}
	public String getName(){
		return name;
	}
	public Homework getHomework(){
		return homework;
	}
	public Lunch getLunch(){
		return lunch;
	}
	public void setName(String nameUpdate){
		name = nameUpdate;
	}
	public void setHomework(Homework homeworkUpdate){
		homework = homeworkUpdate;
	}
	public void setLunch(Lunch lunchUpdate){
		lunch = lunchUpdate;
	}
	public String toString(){
		return "Name: "+name+"\n"+homework+lunch+"\n";
	}
	
	
	
	
	
}
