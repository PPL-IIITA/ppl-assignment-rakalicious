package ass5;
import java.util.ArrayList;
import allLibrary.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *superclass for couple formation
 * @author RAKA
 */
public class CoupleFormation {
    Boys[] boyArray;
    Girls[] girlArray;
    int noOfGirls;
    int noOfBoys;
    ArrayList <Couple> coupleArray = new ArrayList <Couple>();
    /**
     * constructor of superclass for all types of couple formations
     * @param boyArray array of boys
     * @param girlArray array of girls
     * @param noOfGirls number of girls in array
     * @param noOfBoys number of boys in array
     */
    public CoupleFormation(Boys[] boyArray,Girls[] girlArray,int noOfGirls,int noOfBoys){
        this.boyArray = boyArray;
        this.girlArray = girlArray;
        this.noOfBoys = noOfBoys;
        this.noOfGirls = noOfGirls;
    }
    /**
     * method to return couple array
     * @return returns couple array
     */
    public ArrayList <Couple> get_coupleArray(){
        return coupleArray;
    }
}
