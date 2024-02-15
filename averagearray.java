class averagearray{
public static void main (String args[]){
int[] yournumbers = {890, 450, 888, 546, 329, 556};
int a = 0;
for (int i=0; i<=yournumbers.length-1; i++){
 a = yournumbers[i]+a;
}
  double mean = a/yournumbers.length;
System.out.println("Your Mean is"+mean);
}
}