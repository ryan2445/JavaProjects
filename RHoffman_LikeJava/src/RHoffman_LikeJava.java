import java.util.*;
public class RHoffman_LikeJava {
	
    public static void main(String[] args) {
        int checker = 1;
        int holder = 1;
        int seeded = 0;
        int ifChecker = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you like Java? ");
        String a = scan.next();
        if (a.equalsIgnoreCase("y"))
        	System.out.print("Great!");
        if(ifChecker == 0 && a.equalsIgnoreCase("n"))
        {
            System.out.print("Are you sure you dont like Java? ");
            a = scan.next();
            ifChecker = 1;
        }

        while(checker == 1 && ifChecker == 1)
        {
        if(a.equalsIgnoreCase("y"))
        {
            if(holder <= 5)
            {
                System.out.print("Are you ");
                while(seeded < holder)
                {
                    System.out.print("really ");
                	seeded++;
                }
                System.out.print("sure you dont like Java? ");
                a = scan.next();
                seeded=0;
                holder++;
            }
        }
        if(a.equalsIgnoreCase("n"))
        {
        	System.out.print("Okay.");
        	checker=0;
        }
            if(holder > 5)
            {
                checker = 0;
                System.out.print("Too bad.");
            }

        }

    }

}

