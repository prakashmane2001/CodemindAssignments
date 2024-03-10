package polymorphismoverloading;

public class Test {
    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();

        System.out.println("Sum of integers: " + example.add(5, 10));

        System.out.println("Sum of doubles: " + example.add(5.5, 10.5));

        System.out.println("Concatenated Strings: " + example.concatenate("Hello, ", "World!"));
    }
}
