/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02_Square_Ramsey_Kerley;

/**
 * This gives the measure of a side
 *and it gives it a unit of measurement
 * @author ramsey.kerley
 */
public class Measurement {

    private double value;
    private String unit;

    public Measurement(double i, String s) {
        value = i;
        unit = s;

    }
    
    
    
    @Override
    public String toString(){
        return value+" "+unit+"(s)";
        
    }

}
