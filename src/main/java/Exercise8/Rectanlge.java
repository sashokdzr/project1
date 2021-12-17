package Exercise8;

public class Rectanlge {
    private double length =1;
    private double width =1;

    public double perimeter(){
        double per = 3*(length);
        return per;
    }

    public double area(){
        double area = length*width/2;
        return area;
    }
    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length>=0 && length<=20)
        this.length = length;
        else {
            throw new ExceptionInInitializerError("Invalid length value");
        }
    }

    public void setWidth(double width) {
        if (width>=0 && width <=20)
        this.width = width;
        else {
            throw new ExceptionInInitializerError("Invalid width value");
        }
    }
}
