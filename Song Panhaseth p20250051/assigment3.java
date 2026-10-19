package or;
import java.util.Scanner;
public class assigment3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter 5 numbers");
	System.out.print("Input:");
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();	
	int d=input.nextInt();
	int e=input.nextInt();
	int max=a;
	int min=a;
    if(b > max) max = b;
    if(c > max) max = c;
    if(d > max) max = d;
    if(e > max) max = e;

    if(b < min) min = b;
    if(c < min) min = c;
    if(d < min) min = d;
    if(e < min) min = e;
	System.out.println("Among all the five input numbers");
	System.out.print("(" + a + "," + b + "," + c + "," + d + "," + e + "),");
	System.out.print("min is "+min+" and max is "+max+ ".");
	
	input.close();
	}
}
