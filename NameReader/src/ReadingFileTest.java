import java.io.IOException;

public class ReadingFileTest {
	
	public static void main(String[]args) throws IOException
	{
		ReadingFile rf = new ReadingFile();
		rf.readFile();
		rf.fillTwoDArray();
		rf.displaySeatingChart();
	}

}
