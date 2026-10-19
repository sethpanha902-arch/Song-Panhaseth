package or;
import java.util.Scanner;
public class assigment5{
	public void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a number:");
		int n=input.nextInt();
		System.out.println(" ");
		System.out.println("Here are the prime number from 2 to " + n+":");
		for(int i=2;i<=n;i++) {
		if(i%2!=0) {	
			System.out.println(i+" ");
		}
				
		}
		
		input.close();
	}
	
}