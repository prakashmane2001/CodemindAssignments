import java.util.Scanner;
class controlstatement{
public static void main (String arg[]){
  System.out.println("Enter your Character");
    Scanner sc = new Scanner(System.in);	
    char a = sc.next().charAt(0);	
   switch(a){
case 'a':
System.out.println("It is a Vowel");
break;

case 'e':
System.out.println("It is a Vowel");
break;

case 'i':
System.out.println("It is a Vowel");
break;

case 'o':
System.out.println("It is a Vowel");
break;

case 'u':
System.out.println("It is a Vowel");
break;
default: System.out.println("It is a Consonant");

}
}
}