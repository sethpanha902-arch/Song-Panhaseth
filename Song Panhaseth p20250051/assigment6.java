package or;
import java.util.Scanner;
public class assigment6 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your Math's score:");
	int m=input.nextInt();
	System.out.println("Please enter your English's score:");
	int e=input.nextInt();
	System.out.println("Please enter your Physic's score:");
	int p=input.nextInt();
	System.out.println("Please enter your Programming's score:");
	int pr=input.nextInt();
	int maxcount=0,mincount=0;
	double max=m;
	
	if(p>max)max=p;
	if(e>max)max=e;
	if(pr>max)max=pr;
	double min=m;
	if(p<min)min=p;
	if(e<min)min=e;
	if(pr<min)min=pr;
	
    if (m == max) maxcount++;
    if (e == max) maxcount++;
    if (p == max) maxcount++;
    if (pr == max) maxcount++;
    
    if (m == min) mincount++;
    if (e == min) mincount++;
    if (p == min) mincount++;
    if (pr == min) mincount++;
	
	int current=0;
	
	System.out.print("Max score is:"+max+" (");
	if(m==max) {
		current++;
		if(current>1) {
	    if (current == maxcount) System.out.print(" and ");}

		System.out.print(" Math");
	}
	if(e==max) {
		current++;
		if(current>1) {
        if (current == maxcount) System.out.print(" and ");}

		System.out.print(" English");
	}
	if(pr==max) {
		current++;
		if(current>1) {
        if (current == maxcount) System.out.print(" and ");}

		System.out.print(" Programming");
	}
	if(p==max) {
		current++;
		if(current>1) {
        if (current == maxcount) System.out.print(" and ");}

		System.out.print(" Physic");
	}
    if (maxcount == 1) 
        System.out.println(" Course)");
    else 
    	System.out.println(" Courses)");
    
    int minc=0;
    
	System.out.print("Min score is:"+min+" (");
	if(m==min) {
	minc++;
	if(minc>1) {
    if (minc == mincount) System.out.print(" and ");}
    System.out.print(" Math");
	}
	if(e==min) {
		minc++;
		if(minc>1) {
        if (minc == mincount) System.out.print(" and ");}
		System.out.print(" English");
	}
	if(pr==min) {
		minc++;
		if(minc>1) {
        if (minc == mincount) System.out.print(" and ");}
		System.out.print(" Programming");
	}
	if(p==min) {
		minc++;
		if(minc>1) {
        if (minc == mincount) System.out.print(" and ");}
		System.out.print(" Physic");
	}
    if (mincount == 1)
        System.out.print(" Course)");
    else
    	System.out.print(" Courses)");
    
	System.out.println(" ");
	double average=(m+e+p+pr)/4;
	System.out.println("Avergae of this student course is: "+average);
	input.close();
	}
}
