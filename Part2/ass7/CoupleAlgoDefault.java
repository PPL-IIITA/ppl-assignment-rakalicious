package ass7;
import java.util.ArrayList;
import allLibrary.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *class for storing couples in default format chosen
 * @author RAKA
 */
public class CoupleAlgoDefault extends CoupleAlgo{
    Couple[] processedCoupleArray;
    CoupleAlgoArray c = new CoupleAlgoArray(coupleArray);
    /**
     * constructor for class CoupleAlgoDefault
     * @param coupleArray 
     */
    public CoupleAlgoDefault(ArrayList<Couple> coupleArray){
        super(coupleArray);
    }
    /**
     * method to make couples according to chosen algo
     */
    public void make_couple_structure(){
        c.make_couple_structure();
    }
    /**
     * method to check the girlfriend of boy 
     * @param name name of the boy
     */
    public void check_presence(String name){
        c.check_presence(name);
    }
}
