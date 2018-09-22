import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/** This class contains code for 2 types of spacing formats.
 * The first set of methods(tabs & formatTabs) codes for formatting based on tabs ("\t").
 * 		The formatTabs method is the only one that needs to be called.
 * 		This method is meant for simpler formatting, where you choose how many tabs apart your text is.
 * The second set of methods(spaces & formatSize) codes for formatting based on spaces. 
 * 		The formatSize method is the only one that needs to be called.
 * 		This method is meant for precise formatting, where you choose the character size of each column.
 * This class utilizes the fact that the font that the Eclipse console uses makes every character have
 * the same pixel length, allowing the spacing to line up.
 */
public class Formatter {
	private static ArrayList<Passenger> pass = new ArrayList<Passenger>();
	private Passenger[][] seatingChart = new Passenger[10][5];
	private ArrayList<Formatter> waitlist = new ArrayList<Formatter>();
	//METHOD SET 1: TABS
	public String tabs(int numTabs) { //Copy method, but there is no need to call it.
		String output = "";
		for(int i = 0; i < numTabs; i++)
			output += "\t";
		return output;
	}
	public String formatTabs(int numTabs, String text) { 
		/* Parameters: Input how many tabs large you want the spacing of the column to be, then input the String.
		 * Note: The parameters of the method require a String input, and toString() won't be invoked automotically, 
		 * so if you are trying to print an object(e.g. Passenger p1), you'll have to type p1.toString() in the argument.
		 */
		for(int i = 0; i < numTabs; i++)				    
			if(text.length() <= 8*(i+1))
				return text + tabs(numTabs - i);
		return text;
	}
	
	
	public String spaces(int numSpaces) { //Copy method, but there is no need to call it.
		String output = "";
		for(int i = 0; i < numSpaces; i++)
			output += " ";
		return output;
	}
	public String formatSize(int size, String text) { 
		/* Parameters: Input how many characters long you want the spacing of the column to be, then input the String.
		 * Note: The parameters of the method require a String input, and toString() won't be invoked automotically, 
		 * so if you are trying to print an object(e.g. Passenger p1), you'll have to type p1.toString() in the argument.
		 */
		for(;text.length() < size; text += " ");
		return text;
	}
			
	public void readFile() throws IOException{
			String line = null;
			try {
				BufferedReader br = new BufferedReader(new FileReader("src\\Period5_Period6.txt"));
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
			System.out.print((i+1)+"                         ");
		}
		System.out.println("");
		for(int i = 0; i < seatingChart.length; i++)
		{
			System.out.print(i+1+" ");
			for(int j = 0; j<seatingChart[0].length; j++ )
			{
				System.out.print(seatingChart[i][j] +"\t\t");
			}
			System.out.println();
		}
		System.out.println("\nWaiting List: "+waitlist.toString());
	}
	public Passenger[][] getP(){
		return seatingChart;
	}
}
