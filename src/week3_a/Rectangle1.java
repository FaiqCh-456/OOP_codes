package week3_a;

class Rectangle1 {
    private double length;
    private double width;
    private int x;
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Rectangle1(double length, double width, int x, int y) {
        setLength(length);
        setWidth(width);
        setX(x);
        setY(y);

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length >= 0)
            this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>= 0)
            this.width = width;
    }
    public double area(){
        return length*width;
    }
    public double circumference(){
        return 2*(length+width);
    }

    public static Rectangle1 min(Rectangle1 r1, Rectangle1 r2){
        if (r1.area() > r2.area())
            return r1;
        else
            return r2;
    }

    public static boolean overlap(Rectangle1 r1, Rectangle1 r2){
        return ((r1.x + r1.length) > r2.x) && ((r1.y + r1.width) >r2.y);
}

}