class evenoddarray{
public static void main (String args[]){
int[] array = {78, 56, 55,23,89,44,56};
int a = 0;
for (int i = 0; i<array.length; i++){
  a = array[i];
if (a%2==0){
System.out.println("Even numbers "+a);}
else{
System.out.println("Odd numbers "+a);};
}
}
}
