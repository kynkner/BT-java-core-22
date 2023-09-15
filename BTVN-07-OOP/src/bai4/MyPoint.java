package bai4;

public class MyPoint {
    public double x;
    public double y;

    public MyPoint(){

    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
