public class Driver {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(30, 30,0,0);
        Rectangle1 r2 = new Rectangle1(30,40,50,50);
        System.out.println("Area is " + r1.area());
        System.out.println("Circumference is " + r1.circumference());
        Rectangle1 big_rec = Rectangle1.min(r2,r1);
        System.out.println(Rectangle1.overlap(r1,r2));

}
}