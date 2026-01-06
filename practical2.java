import java.util.Scanner;

 public class practical2


{

	public static void main(String args[])
 
	 {	
		Scanner s1 =new Scanner(System.in);
		Double a;
		Double b;
		Double c;
		Double d ;
		Double e;
		Double f;
		Double D,Dx,Dy,x,y ;

System.out.println("Enter value of a: ");
a=s1.nextDouble();

System.out.println("Enter value of b: ");
b=s1.nextDouble();

System.out.println("Enter value of c: ");
c=s1.nextDouble();

System.out.println("Enter value of d: ");
d=s1.nextDouble();

System.out.println("Enter value of e: ");
e=s1.nextDouble();

System.out.println("Enter value of f: ");
f=s1.nextDouble();


D=a*d-b*c;
Dx=e*d-b*f;
Dy=a*f-c*e;

x=Dx/D ;
y=Dy/D ;
 
System.out.println("x="+x);

System.out.println("y="+y);

   }
}





