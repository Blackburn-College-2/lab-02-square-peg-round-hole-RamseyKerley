/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02_Square_Ramsey_Kerley;

/**
 *
 * @author paul.kline
 */
public class Main {

    /**
     * I believe that it would take about 4 hours of focused work It took 8
     * hours
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square sq = new Square(8.0);
        Square sq2 = new Square(7000.0);

        Rectangle r = new Rectangle(69, 89);
        Rectangle rect2 = new Rectangle(79, 88);

        System.out.println(r);
        System.out.println(sq2);

        Ellipse e = new Ellipse(6, 8, "meter");
        Circle c;
        c = new Circle(9, 9, "meters");

        System.out.println("The ellipse has a perimeter of " + e.getPerimeter()
                + " and an area of " + e.getArea());

        System.out.println("The circle has a perimeter of " + c.getPerimeter()
                + " and an area of " + c.getArea());

        System.out.println("efficiency : " + r.getEfficiency() );
        System.out.println("efficiency :" + sq2.getEfficiency());
        System.out.println("efficiency :" + e.getEfficiency());
        System.out.println("efficiency :" + c.getEfficiency());

    }

}
