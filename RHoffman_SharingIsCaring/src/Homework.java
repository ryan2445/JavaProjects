import java.util.*;
public class Homework {
	private String answer1, answer2, assignmentName;
	static String dueDate = "11/29/2017";
	static String todaysDate = "11/28/2017";
	
	public Homework(String assignmentName) {
		this.assignmentName = assignmentName;
		answer1 = null;
		answer2 = null;
	}
	public Homework(String answer1, String answer2, String assignmentName)
	{
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.assignmentName = assignmentName;
	}
	public String getAnswer1() {
		return answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public String getAssignmentName() {
		return assignmentName;
	}
	public void setAnswer1(String answer1Update) {
		answer1 = answer1Update;
	}
	public void setAnswer2(String answer2Update) {
		answer2 = answer2Update;
	}
	public void setAssignmentName(String assignmentNameUpdate) {
		assignmentName = assignmentNameUpdate;
	}
	public String toString() {
		return "Assignment Name: "+assignmentName+" 1st Answer: "+answer1+" 2nd Answer: "+answer2+" Due Date: "+dueDate+"\n";
	}
}
