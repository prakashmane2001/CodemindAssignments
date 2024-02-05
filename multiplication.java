import java.util.Scanner;
class multiplication {
   public static void main(String args[]){
   multiplication k = new multiplication();
   k.m1();
}
void m1() {
System.out.println("Enter Your First Number");
Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
System.out.println("Enter Your Second number");
 int b = sc.nextInt();
 int c = a*b;
System.out.println("Product of your Two number is"+c);
}
}
