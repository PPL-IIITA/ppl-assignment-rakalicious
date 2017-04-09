/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass5;
/**
 *
 * @author RAKA
 */
import allLibrary.*;
public class DefaultCouple extends CoupleFormation{
    /**
     * constructor for DefaultClass class
     * @param boyArray array of boys
     * @param girlArray array of girls
     * @param noOfGirls number of girls in array
     * @param noOfBoys number of boys in array
     */
    public DefaultCouple(Boys[] boyArray,Girls[] girlArray,int noOfGirls,int noOfBoys){
        super(boyArray,girlArray,noOfBoys,noOfGirls);
    }
    /**
     * make couples in default way chosen
     * @param boyArray array of boys
     * @param girlArray array of girls
     * @param noOfGirls number of girls in array
     * @param noOfBoys number of boys in array
     */
    public void make_couple(Boys[] boyArray,Girls[] girlArray,int noOfGirls,int noOfBoys){
        BasicCouple c = new BasicCouple(boyArray,girlArray,noOfBoys,noOfGirls);
        c.make_couple();
        
        coupleArray = c.get_coupleArray();
    }
    
}
