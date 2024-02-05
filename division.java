import java.util.Scanner;
class division {
  public static void main(String args[]){
	division k = new division();
	k.m1();
}
void m1(){
System.out.println("Your First Number");
 Scanner sc = new Scanner(System.in);
 float a = sc.nextFloat();
System.out.println("Your Second Number");
 float b = sc.nextFloat();
 float c = a/b;
System.out.println("Your Division is"+c);
}
}