import java.util.Scanner;

class arthmetic{
   public static void main(String args[]){
	arthmetic k = new arthmetic();
	System.out.println("Addition Start");
	k.sum();
	System.out.println("Substraction Start");
	k.substraction();
	System.out.println("Multiplication Start");
	k.multiplication();
	System.out.println("Division Start");
	k.division();
}
  void sum() {
System.out.println("Enter First Number");
Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
System.out.println("Enter Second Number");
 int b = sc.nextInt();
 int c = a+b;
System.out.println("Your Sum is"+c);
}
void substraction() {
System.out.println("Enter Your First Number");
	Scanner sc = new Scanner(System.in);
	float x = sc.nextFloat();
System.out.println("Enter Your Second Number");
	float y = sc.nextFloat();
	float z = x-y;

System.out.println("Your Substraction is"+z);
}
void multiplication() {
System.out.println("Enter Your First Number");
Scanner sc = new Scanner(System.in);
 int p = sc.nextInt();
System.out.println("Enter Your Second number");
 int q = sc.nextInt();
 int r = p*q;
System.out.println("Product of your Two number is"+r);
}
void division(){
System.out.println("Your First Number");
 Scanner sc = new Scanner(System.in);
 float m = sc.nextFloat();
System.out.println("Your Second Number");
 float n = sc.nextFloat();
 float o = m/n;
System.out.println("Your Division is"+o);
}
}
