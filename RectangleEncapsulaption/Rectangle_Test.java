public class Rectangle_Test {
    public static void main(String[] args) {
        Rectangle rt = new Rectangle();
        rt.setLength(20);
        rt.setBreadth(30);

        int lth = rt.getLength();
        int bth = rt.getBreadth();
        int area = lth * bth;
        System.out.println("Area: " + area);

        rt.setLength(50);
        rt.setBreadth(60);

        int ln = rt.getLength();
        int br = rt.getBreadth();
        int newArea = ln * br;
        System.out.println("New area: " + newArea);
    }
}