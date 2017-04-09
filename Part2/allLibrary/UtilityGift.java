package allLibrary;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *child class for Utility Gifts
 * @author RAKA
 */
public class UtilityGift extends Gifts{

    private int utility_value;
    private int utility_class;
    /**
     * constructor for gift class
     * @param name name of gift
     * @param price price of gift
     * @param value value of gift
     * @param utility_value utility value of gift
     * @param utility_class utility class of gift
     */
    public UtilityGift(String name,int price,int value,int utility_value,int utility_class){
        super("Utility",name,price,value);
        this.utility_value = utility_value;
        this.utility_class = utility_class;
    }
    
    /**
     * to set the utility value of the gift on a rating of 1 to 100
     * @param utility_value utility value of the gift
     */
    public void set_utility_value(int utility_value){
        this.utility_value = utility_value;
    }
    /**
     * to return the utility value on a rating of 1 to 100
     * @return return the utility value
     */
    public int set_utility_value(){
        return utility_value;
    }
    
    /**
     * to set the utility class of the gift on a rating of  1 to 100
     * @param utility_class utility class of the gift
     */
    public void set_utility_class(int utility_class){
        this.utility_class = utility_class;
    }
    /**
     * to return the utility class of the gift
     * @return return the utility class of gift
     */
    public int get_utility_class(){
        return utility_class;
    }
}
