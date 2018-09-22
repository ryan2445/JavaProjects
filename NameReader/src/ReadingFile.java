import java.util.*;
import java.io.*;

public class ReadingFile {
	
	private static ArrayList<Passenger> pass = new ArrayList<Passenger>();
		   
	private Passenger[][] seatingChart = new Passenger[10][5];
			
			//BufferedReader br = new BufferedReader(new FileReader("Period5_Period6.txt"));
			
	public void readFile() throws IOException{
			String line = null;
			
			try {
				//Scanner scan = new Scanner(new File("src\\Period5_Period6.txt"));
				BufferedReader br = new BufferedReader(new FileReader("src\\Period5_Period6.txt"));
				int row = 0, col = 0;
				while ((line = br.readLine()) != null)
				{   
				      
					String[] values = line.split(",");
					String firstName = values[1];
					String lastName = values[0];
					pass.add(new Passenger(firstName,lastName));
					//System.out.println(pass.get(pass.size()-1));
				
					
					

				
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
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
		for(int i = 0; i < seatingChart.length; i++)
		{
			for(int j = 0; j<seatingChart[0].length; j++ )
			{
				System.out.print(seatingChart[i][j] +"\t\t");
		      
			}
			System.out.println();
		}
		
	}
	
	
}
