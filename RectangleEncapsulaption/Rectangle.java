class Rectangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int newLength) {
        if (newLength > 0) {
            this.length = newLength;
        } else {
            System.out.println("Please Enter Valid Length.");
        }
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int newBreadth) {
        if (newBreadth > 0) {
            this.breadth = newBreadth;
        } else {
            System.out.println("Please Enter Valid Breadth.");
        }
    }
}