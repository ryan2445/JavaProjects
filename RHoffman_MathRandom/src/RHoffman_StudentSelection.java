import java.util.*;
public class RHoffman_StudentSelection {
	
	public static void main(String[] args) {
			String[] namelist = {" Ryan", " Marco", " Conner", " Grant", " Carson", " Adam", " Kyle", " Karalyn", " Lauren", " Jake"};
			String[] stars = {"","","","","","","","","","",};
			int[] starnum = new int[10];
			int benchmark = 0;
			int biggest =0;
			int random = 0;
			for(int i=0; i<250; i++)
			{
				random = (int)(Math.random()*10);
				stars[random] += "*";
				starnum[random]++;
			}
			System.out.println("1: "+stars[0]+namelist[0]);
			System.out.println("2: "+stars[1]+namelist[1]);
			System.out.println("3: "+stars[2]+namelist[2]);
			System.out.println("4: "+stars[3]+namelist[3]);
			System.out.println("5: "+stars[4]+namelist[4]);
			System.out.println("6: "+stars[5]+namelist[5]);
			System.out.println("7: "+stars[6]+namelist[6]);
			System.out.println("8: "+stars[7]+namelist[7]);
			System.out.println("9: "+stars[8]+namelist[8]);
			System.out.println("10: "+stars[9]+namelist[9]);
			for(int i=0; i<starnum.length; i++)
			{
				if(biggest<starnum[i])
				{
					biggest=starnum[i];
					benchmark=i;
				}
			}
			System.out.println("Student Selected: "+(benchmark+1)+","+namelist[benchmark]);
		}

	}

