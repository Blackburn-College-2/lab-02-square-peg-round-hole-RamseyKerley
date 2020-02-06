/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02_Square_Ramsey_Kerley;

/**
 * this is a blueprint of a circle
 *
 * @author ramsey.kerley
 */
public class Circle extends Ellipse {

    private Measurement radius;

    
    public Circle(double radius, double radius1, String unit) {
        super(radius, radius1, unit);
        this.radius = new Measurement(radius, unit);
        System.out.println("New Circle has a radius of " + this.radius);

    }
    /**
     * calculates the perimeter
     * @return 
     */
    @Override
    public Measurement getPerimeter() {
        double x = 2 * Math.PI * radius.value;

        Measurement perimeter = new Measurement(x, "meter");
        return perimeter;
    }
    /**
     * gets the area
     * @return 
     */
    @Override
    public Measurement getArea() {
        double x = Math.PI * (radius.value * radius.value);
        Measurement area = new Measurement(x, "meter");
        return area;
    }

}
