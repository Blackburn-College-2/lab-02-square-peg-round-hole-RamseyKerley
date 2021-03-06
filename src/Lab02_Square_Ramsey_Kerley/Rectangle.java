/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02_Square_Ramsey_Kerley;

/**
 * This class is the blue print to make a rectangle
 *
 * @author ramsey.kerley
 */
public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    /**
     * gets the area
     * @return 
     */
    public double getArea() {
        return width * height;
    }
    /**
     * gets the perimeter
     * @return 
     */
    public double getPerimeter() {
        return (width + height) * 2;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Measurement getEfficiency() {
        double x = this.getArea() / this.getPerimeter();
        Measurement efficiency = new Measurement(x, "meter");
        return efficiency;
    }

    @Override
    public String toString() {

        Measurement rectangle = new Measurement(width, "Meter");
        Measurement rect = new Measurement(height, "Meter");
        String s = rectangle.toString();
        String s2 = rect.toString();
        return "The Rectangle is " + s + " by " + s2;
    }

}
