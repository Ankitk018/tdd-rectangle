public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        if(length<0 || width < 0){
            throw new IllegalArgumentException("Length and Width must be non-negative values");
        }

        this.length=length;
        this.width=width;
    }

    public double calculateArea() {

        return length*width;
    }
}
