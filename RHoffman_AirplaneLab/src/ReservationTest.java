//Ryan Hoffman - Period 5 - Airplane Lab
import java.io.IOException;

public class ReservationTest {

	public static void main(String[]args) throws IOException
	{
		Reservation r1 = new Reservation();
		r1.readFile();
		r1.fillTwoDArray();
		r1.displaySeatingChart();
		r1.start();
	}

}

