package AreaOverload;

public class Test {

    public static void main(String[] args) {
        CalculateArea k = new CalculateArea();

        int Rarea = k.areaRectangle(22, 15);
        float Carea = k.areaCircle(15);
        float Tarea = k.areaTriangle(24, 23);

        System.out.println("Area of rectangle: " + Rarea);
        System.out.println("Area of circle: " + Carea);
        System.out.println("Area of triangle: " + Tarea);
    }

}
