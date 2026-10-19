package or;
import java.util.Scanner;
public class assigment2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, b, c;
		System.out.println("=======================");
		System.out.println("Welcome to our program:");
		System.out.println("=======================");
		System.out.println("please neter a");
		a=sc.nextInt();
		System.out.println("please neter b");
		b=sc.nextInt();
		System.out.println("please neter c");
		c=sc.nextInt();
		System.out.println("Eqaution:"+a+"x²+ "+b+"x +"+c);
		double delta,x1,x2;
		delta=b*b-4*a*c;
		x1=(-b+Math.sqrt(delta))/(2*a);
		x2=(-b-Math.sqrt(delta))/(2*a);
		if(Math.sqrt(delta)>0) {
		System.out.println("=======================");
		System.out.println("Delta:"+delta);
		System.out.println("X1:"+x1);
		System.out.println("X2:"+x2);
		System.out.println("=======================");}
		else {
		System.out.println("=======================");
		System.out.println("It has no root");
		System.out.println("=======================");
		}
		
		
		sc.close();
	}
}
