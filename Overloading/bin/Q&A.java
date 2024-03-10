Q. What is the advantage of method overloading ?
/*Improved Readability: Overloading allows you to use the same method name for different behaviors or functionalities. This can make your code more readable and intuitive. For example, you might have a calculateArea method that can handle different shapes based on the parameters passed.

Reduced Code Duplication: Instead of creating multiple methods with different names to perform similar tasks, you can use method overloading to create a single method with the same name but different parameter lists. This reduces code duplication and promotes code reuse.

Convenience for Developers: Overloading provides a convenient way for developers to use a method with varying parameter types or numbers. This flexibility simplifies the API for users of the class and allows them to choose the most appropriate method based on their needs.

Default Values: With overloading, you can provide default values for parameters, making it possible to call a method with fewer arguments. This is particularly useful when you want to maintain backward compatibility or when dealing with optional parameters.

Polymorphism: Overloading is a form of compile-time polymorphism, where the compiler determines the appropriate method to call based on the method signature and the arguments passed. This is resolved during compile-time, which can result in better performance compared to runtime polymorphism.

Code Maintenance: If you need to make changes to a method's behavior, you only need to update it in one place when overloading is used. This can simplify code maintenance and reduce the chances of introducing errors.*/