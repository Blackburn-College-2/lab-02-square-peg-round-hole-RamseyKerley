/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02_Square_Ramsey_Kerley;

/**
 * This is a blueprint for ellipse
 *
 * @author ramsey.kerley
 */
public class Ellipse {

    private Measurement majorAxis;
    private Measurement minorAxis;

    public Ellipse(double minorAxis, double majorAxis, String unit) {
        this.majorAxis = new Measurement(majorAxis, unit);
        this.minorAxis = new Measurement(minorAxis, unit);
        System.out.println("New Ellipse has a major axis: " + this.majorAxis
                + " and a minor axis: " + this.minorAxis);

    }
/**
 * calculates the perimeter
 * @return the perimeter of the ellipse
 */
    public Measurement getPerimeter() {
        double x = 2 * Math.PI * Math.sqrt(((majorAxis.value * majorAxis.value) + (minorAxis.value * minorAxis.value)) / 2);
        Measurement perimeter = new Measurement(x, "meter");
        return perimeter;
    }
/**
 * calculates the area
 * @return the area and the units
 */
    public Measurement getArea() {
        double x = Math.PI * majorAxis.value * minorAxis.value;
        Measurement area = new Measurement(x, "meter");
        return area;
    }
    /**
     * calculates the efficiency
     * @return efficiency
     */
    public Measurement getEfficiency() {
        double x = this.getArea().value / this.getPerimeter().value;
        Measurement efficiency = new Measurement(x, "meter");
        return efficiency;
    }

}
