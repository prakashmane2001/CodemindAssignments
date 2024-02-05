import java.util.Scanner;

class sum{
   public static void main(String args[]){
	sum k = new sum();
	k.m1();
}
  void m1() {
System.out.println("Enter First Number");
Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
System.out.println("Enter Second Number");
 int b = sc.nextInt();
 int c = a+b;
System.out.println("Your Sum is"+c);
}
}