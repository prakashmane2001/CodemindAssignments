import java.util.Scanner;
class controlstatement1{
	public static void main(String args[]){
  	System.out.println("Enter Divedent");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("Enter Divisor");
	int b = sc.nextInt();
	int c = a/b;
	System.out.println("Your Quotient is" +c);
	int d = a%b;
	System.out.println("Your Remainder is" +d);
}
}