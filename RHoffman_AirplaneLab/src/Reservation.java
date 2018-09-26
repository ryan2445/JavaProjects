//Ryan Hoffman - Period 5 - Airplane Lab
import java.util.*;
import java.io.*;

public class Reservation {
	private static ArrayList<Passenger> pass = new ArrayList<Passenger>();
	private Passenger[][] seatingChart = new Passenger[10][5];
	private ArrayList<Passenger> waitlist = new ArrayList<Passenger>();
			
	public void readFile() throws IOException{
			String line = null;
			try {
				BufferedReader br = new BufferedReader(new FileReader("src\\"));
				int row = 0, col = 0;
				while ((line = br.readLine()) != null)
				{    
					String[] values = line.split(",");
					String firstName = values[1];
					String lastName = values[0];
					pass.add(new Passenger(firstName,lastName));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	public void fillTwoDArray()
	{  int index = 0;
		for(int i = 0; i < seatingChart.length; i++)
		{
			for(int j = 0; j<seatingChart[0].length; j++ )
			{
				seatingChart[i][j]=pass.get(index);
				index++;
			}		
		}
	}
	public void displaySeatingChart()
	{
		System.out.println("");
		for(int i=0;i<5;i++){
			System.out.print((i+1)+"                        ");
		}
		System.out.println("");
		for(int i = 0; i < seatingChart.length; i++)
		{
			System.out.print(i+1+" ");
			for(int j = 0; j<seatingChart[0].length; j++ )
			{
				System.out.print(seatingChart[i][j]+"               ");
			}
			System.out.println();
		}
		System.out.println("\nWaiting List: "+waitlist.toString());
	}
	public void start() {
		int breaknum=0;
		Scanner scan = new Scanner(System.in);
		Passenger empty = new Passenger("empty", "");
		System.out.println("\nWould you like to: \n1.Add Passenger\n2.Remove Passenger\n3.Exit");
		System.out.print("Enter #: ");
		int choice=scan.nextInt();
		if(choice==1) {
			for(int i=0;i<seatingChart.length;i++) {
				if(breaknum==1) {
					break;
				}
				for(int j=0;j<seatingChart[0].length;j++){
					if(seatingChart[i][j].toString().equals(empty.toString())) {
						addPassenger();
						breaknum=1;
					}
					if(breaknum==1) {
						break;
					}
				}
			}
			if(breaknum==0) {
				System.out.println("There are no empty seats.");
				System.out.println("Enter your first and last name to be added to the waitlist:");
				String fname = scan.next();
				String lname = scan.next();
				Passenger newpass = new Passenger(fname, lname);
				waitlist.add(newpass);
				displaySeatingChart();
				start();
			}
		}
		else if(choice==2) {
			removePassenger();
		}
		else if(choice==3) {
			quitApp();
		}
	}
	public void addPassenger() {
		Scanner scan = new Scanner(System.in);
		Passenger empty = new Passenger("empty", "");
		System.out.println("Enter your first and last name:");
		String fname = scan.next();
		String lname = scan.next();
		Passenger newpass = new Passenger(fname, lname);
		System.out.println("Please choose an empty seat.");
		System.out.println("Enter your row #:");
		int row = scan.nextInt();
		System.out.println("Enter your column #:");
		int column = scan.nextInt();
		row--;
		column--;
		if(seatingChart[row][column].toString().equals(empty.toString())) {
			seatingChart[row][column]=newpass;
			System.out.println("You have taken the seat in row "+(row+1)+" column "+(column+1));
		}
		else {
			System.out.println("That seat is already taken.");
			start();
		}
		displaySeatingChart();
		start();
	}
	public void removePassenger() {
		int breaknum=0;
		int r=0;
		int c=0;
		Scanner scan = new Scanner(System.in);
		Passenger empty = new Passenger("empty", "");
		System.out.println("Enter the first and last name:");
		String fname = scan.next();
		String lname = scan.next();
		Passenger newpass = new Passenger(fname, lname);
		for(int i=0;i<seatingChart.length;i++){
			if(breaknum==1) {
				break;
			}
			for(int j=0;j<seatingChart.length;j++){
				r=j;
				c=i;
				if(seatingChart[r][c].toString().equals(newpass.toString())){
					seatingChart[r][c]=empty;
					System.out.print(newpass+" has been removed from seat in row "+(r+1)+" column "+(c+1));
					breaknum=1;
				}
				if(breaknum==1) {
					break;
				}
			}
		}
		if(breaknum==0) {
				System.out.println("That name is not on the plane.");
		}
		for(int k=0;k<waitlist.size();k++) {
			if(waitlist.get(k).equals(empty)) {
			}
			else {
				seatingChart[r][c]=waitlist.get(k);
				waitlist.remove(k);
			}
		}
		displaySeatingChart();
		start();
	}
	
	public void quitApp() {
		displaySeatingChart();
		System.out.println("Quitting Application...");
		System.exit(0);
	}
}