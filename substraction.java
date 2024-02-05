import java.util.Scanner;

class substraction{
  public static void main(String args[]){
	substraction k = new substraction();
	k.m1();
}
void m1() {
System.out.println("Enter Your First Number");
	Scanner sc = new Scanner(System.in);
	float a = sc.nextFloat();
System.out.println("Enter Your Second Number");
	float b = sc.nextFloat();
	float c = a-b;

System.out.println("Your Substraction is"+c);
}
}