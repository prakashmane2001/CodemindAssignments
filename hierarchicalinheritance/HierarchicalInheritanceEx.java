
public class HierarchicalInheritanceEx {

	public static void main (String args []) {
	   Vehicle k1 = new Vehicle();
	   Motorcycle k2 = new Motorcycle ();
	   k2.vehicleneumber = 6651;
	   k2.Type = "Splendor Two Wheeler";
	   k2.color = "red";
	   k2.TopSpeed = "120";
	   Car k3 = new Car();
	   k3.vehicleneumber = 7777;
	   k3.Type = "Ertiga";
	   k3.color = "White";
	   k3.TopSpeed = "150";
	k1.showvehicle();
	k2.showmotorcycle();
	   System.out.println("Vehicle number- "+ k2.vehicleneumber);
	   System.out.println("Type- "+ k2.Type);
	   System.out.println("Color-"+ k2.color);
	   System.out.println("TopSpeed- "+ k2.TopSpeed);
	k3.showcar();	
	 System.out.println("Vehicle number- "+ k3.vehicleneumber);
	   System.out.println("Type- "+k3.Type);
	   System.out.println("Color- "+ k3.color);
	   System.out.println("TopSpeed- "+ k3.TopSpeed); 
	   
	}
	}