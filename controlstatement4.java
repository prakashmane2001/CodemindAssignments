import java.util.Scanner;
class controlstatement4 {
	 public static void main(String args[]){
	controlstatement4 k = new controlstatement4();
	k.greadingsystem();
  }
void greadingsystem(){
System.out.println("Enter Your Marks");
Scanner sc = new Scanner(System.in);
int marks = sc.nextInt();
int f = 25;
int e = 45;
int d = 50;
int c = 60;
int b = 80;
int a = 100;
if (marks<f){
System.out.println("Your grade is F");}
else if(marks>=f && marks<e){
System.out.println("Your grade is E");}
else if (marks>=e && marks<d) {
System.out.println("Your grade is D");}
else if (marks>=d && marks<c) {
System.out.println("Your grade is C");}
else if (marks>=c && marks<b) {
System.out.println("Your grade is B");}
else if (marks>=b && marks<a) {
System.out.println("Your grade is A");}
else {
System.out.println("You Entered Wrong Marks");}
}
}

