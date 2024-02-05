import java.util.Scanner;
class controlstatement5 {
	public static void main(String args[]){
	System.out.println("Enter Your Character");
          Scanner sc = new Scanner(System.in);
	char youralphabet = sc.next().charAt(0);
if (youralphabet>='a' && youralphabet<='z'){
System.out.println("Your Character is Lowercase");}
else if(youralphabet>='A' && youralphabet<='Z'){
System.out.println("Your Character is Uppercase");}
else {
System.out.println("Please enter a valid Character");
}
}
}