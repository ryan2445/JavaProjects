import java.util.*;
public class SharingIsCaring {
	
	
	public static void swapLunches(Friend f1, Friend f2) {
		Lunch lTemp = f1.getLunch();
		f1.setLunch(f2.getLunch());
		f2.setLunch(lTemp);
		Lunch.setIsYummy(true);
	}
	public static void shareHomework(Homework homework1, Homework homework2) {
		homework2.setAnswer1(homework1.getAnswer1());
		homework2.setAnswer2(homework1.getAnswer2());
	}
}
