package allLibrary;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *child class for Luxury Gifts
 * @author RAKA
 */
public class LuxuryGift extends Gifts{

    private int luxury_rating;
    private int diff_obtain;
    /**
     * constructor for gift class
     * @param name name of gift
     * @param price price of gift
     * @param value value of gift
     * @param luxury_rating luxury rating of gift
     * @param diff_obtain difficulty to obtain the gift
     */
    public LuxuryGift(String name,int price,int value,int luxury_rating,int diff_obtain){
        super("Luxury",name,price,value);
        this.luxury_rating = luxury_rating;
        this.diff_obtain = diff_obtain;
    }
    
    /**
     * to set the luxury rating of gift on rating of 1 to 100
     * @param luxury_rating luxury rating of gift
     */
    public void set_Luxury_rating(int luxury_rating){
        this.luxury_rating = luxury_rating;
    }
    /**
     * to return the luxury rating of gift on a rating of 1 to 100
     * @return luxury rating of gift
     */
    public int get_Luxury_rating(){
        return luxury_rating;
    }
    
    /**
     * to set the difficulty to obtain on a rating of 1 to 100
     * @param diff_obtain difficulty to obtain the gift
     */
    public void set_diff_obtain(int diff_obtain){
        this.diff_obtain = diff_obtain;
    }
    /**
     * to return the difficulty to obtain
     * @return return the difficulty to obtain
     */
    public int get_diff_obtain(){
        return diff_obtain;
    }
}
