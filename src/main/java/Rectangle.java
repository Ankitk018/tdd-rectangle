public class Rectangle {


    public double calculateArea(double length, double width) {
        if(length<0 || width < 0){
            throw new IllegalArgumentException("Length and Width must be non-negative values");
        }
        return length*width;
    }
}
