/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02_Square_Ramsey_Kerley;

/**
 *
 * @author ramsey.kerley
 */
public class Square extends Rectangle {

    private double side;
    
    /**
     *
     * @param side
     */
    public Square(double side) {
        super(side, side);
        this.side = side;
        //System.out.println("Width = " + super.getHeight()
          //      + " Height = " + super.getHeight());
       
        
    }
    
      

    @Override
    public String toString() {
     Measurement sqaure = new Measurement(side ,"Meter");
     String s = sqaure.toString();
        return "Square is " + s + " by " + s;
    }

}
