package AnimalOverriding;

public class Test {
        public static void main(String args[]) {
        	Animal k = new Animal();
        	Dog k1 = new Dog();
            Cat k2 = new Cat();
            Pig k3 = new Pig();
            
            k.printSound();
            k1.printSound(); 
            k2.printSound(); 
            k3.printSound();
        }
}
