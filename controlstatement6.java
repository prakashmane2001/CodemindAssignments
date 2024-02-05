import java.util.Scanner;
class controlstatement6 {
	 public static void main(String args[]){
	System.out.println("Enter Your Number");
          Scanner sc = new Scanner(System.in);
           int number = sc.nextInt();
   if(number>=1){
System.out.println("Your Number Is Positive");}
else if (number<=-1){
System.out.println("Your Number Is Negative");}
else {
System.out.println("You Entered a Zero");}
}
}