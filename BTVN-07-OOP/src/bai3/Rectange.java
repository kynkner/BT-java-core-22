package bai3;

public class Rectange {
    public double Width;
    public double Height;
    public String Color;
    public Rectange(){

    }
    @Override
    public String toString() {
        return "Rectange{" +
                "Width=" + Width +
                ", Height=" + Height +
                ", Color='" + Color + '\'' +
                '}';
    }

    public Rectange(double width, double height, String color) {
        Width = width;
        Height = height;
        Color = color;
    }

}
