public class sumofarrayelement {
public static void main (String args[]){
int[] numbers = {89, 56, 84, 25, 65, 75, 35, 25};
int a = 0;
for(int i=0; i<=numbers.length-1; i++){
 a = numbers[i]+a;
}
System.out.println("Addition of array element is"+a);
}
}
 
