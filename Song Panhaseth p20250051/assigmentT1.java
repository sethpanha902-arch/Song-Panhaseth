package or;
import java.util.Scanner;
public class assigmentT1 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int string;
		int sum=0,count=0;
		double average;
		System.out.println("Please enter a number:");
		string =sc.nextInt();
		for(int n=1000;n>=string;n--) {
			System.out.print(n+" ");
			sum+=n;
			count++;
			if(count%10==0) {
				System.out.println("");
			}
		}
		average=sum/count;
		System.out.println("");
		System.out.println("sum:"+sum);
		System.out.println("avg:"+average);
		sc.close();
	}
}