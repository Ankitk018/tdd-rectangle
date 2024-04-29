public class Square {

    private double side;

    public Square(double side){
        if(side<=0){
            throw new IllegalArgumentException("Length cannot be zero or non positive number");
        }
        this.side=side;
    }

    public double area() {
        return side*side;
    }
}
