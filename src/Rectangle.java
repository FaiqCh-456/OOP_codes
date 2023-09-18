public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);

    }

    public double calcArea() {

        return length * width;
    }

    public double calCircumference() {
        if (length > 0 && width > 0) {
            return 2 * (this.length + this.width);
        }
        else
            return 0;
    }


        public double getLength () {

            return this.length;
        }

        public double getWidth () {

            return this.width;
        }

        public void setLength ( double length){
            if (length > 0) {
                this.length = length;
            }

        }
        public void setWidth ( double width){

            if (width > 0) {
                this.width = width;
            }
        }


    }






