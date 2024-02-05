import java.util.Scanner;
class controlstatement2{
	public static void main(String args[]){
  	System.out.println("Enter First Number");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("Enter Second Number");
	int b = sc.nextInt();
	System.out.println("Enter Third Number");
	int c = sc.nextInt();
	if(a>=b && a>=c){
	System.out.println("The Greatest Number is"+a);
	} 
	else if (b>=a && b>=c) {
            System.out.println("The Greatest Number is"+b);
        } else {
            System.out.println("The Greatest Number is"+c);
        }
	}
}