
public class multilevelinheritance {
	public static void main (String args[]) {
		parent k1 = new parent();
                k1.Name = "Manojkumar Mane";
		k1.FatherName = "Mahadev Mane";
		k1.MotherName = "Mangal";		
		child k2 = new child();
		k2.Name = "Prakash Mane";
		k2.FatherName = "Manojkumar Mane";
		k2.MotherName = "Manisha";
		grandchild k3 = new grandchild();
		k3.Name = "XYZ";
		k3.FatherName = "Prakash Mane";
		k3.MotherName = "ABC";
		
	k1.M1();
	System.out.println("Name- "+k1.Name);
	System.out.println("Father Name- "+k1.FatherName);
	System.out.println("Mother Name- "+k1.MotherName);
	  k2.M2();
	System.out.println("Name- "+k2.Name);
	System.out.println("Father Name- "+k2.FatherName);
	System.out.println("Mother Name- "+k2.MotherName);
	  k3.M3();
	System.out.println("Name- "+k3.Name);
	System.out.println("Father Name- "+k3.FatherName);
	System.out.println("Mother Name- "+k3.MotherName);
	  		
	}

}
