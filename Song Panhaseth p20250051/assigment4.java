package or;
import java.util.Scanner;
public class assigment4{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int year,day,month;
		String x,y;
		System.out.println("Please enter your date: ");
		while(true) {
            System.out.println("Enter year: ");
            year = input.nextInt();
            System.out.println("Enter month: ");
            month = input.nextInt();
            System.out.println("Enter day: ");
            day = input.nextInt();
		System.out.print("Your date(:"+day+"-"+month+"-"+year+") is");
		int maxday;	
		if(month ==2) {
			if(year%4==0)
			maxday=29;
			else
			maxday=28;
		}
		else if(month==4||month==6||month==9||month==12)
			maxday=30;
		else
			maxday=31;
		if(month>=1&&month<=12&&day>=1&&day<=maxday) {
			System.out.println(" valid");
			break;
		}
		else {
			System.out.println(" Invalid");
		}
		}	
	}	
}




