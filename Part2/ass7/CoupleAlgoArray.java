package ass7;
import java.util.ArrayList;
import allLibrary.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *class for storing couples in array format
 * @author RAKA
 */
public class CoupleAlgoArray extends CoupleAlgo{
    Couple[] processedCoupleArray;
    /**
     * constructor for CoupleAlgoArray class
     * @param coupleArray array of couples formed
     */
    public CoupleAlgoArray(ArrayList<Couple> coupleArray){
        super(coupleArray);
    }
    /**
     * method to make couples according to chosen algo
     */
    public void make_couple_structure(){
        processedCoupleArray = coupleArray.toArray(new Couple[coupleArray.size()]);
    }
    /**
     * method to check the girlfriend of boy 
     * @param name name of the boy
     */
    public void check_presence(String name){
        int i;
        boolean commited = false;
        for(i = 0; i < coupleArray.size() ; i++){
            if(processedCoupleArray[i].get_boy().get_name().compareTo(name) == 0){
                System.out.println("This boy is commited. Girlfriend : " + processedCoupleArray[i].get_girl().get_name());
                commited = true;
                break;
            }
        }
        if(commited == false){
            System.out.println("This boy is not commited");
        }
    }
}
