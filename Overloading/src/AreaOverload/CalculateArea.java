package AreaOverload;

public class CalculateArea {

    int areaRectangle(int length, int breadth) {
        return length * breadth;
    }

    float areaCircle(float radius) {
        return 3.14f * radius * radius;
    }

    float areaTriangle(float base, float height) {
        return 0.5f * base * height;
    }

}