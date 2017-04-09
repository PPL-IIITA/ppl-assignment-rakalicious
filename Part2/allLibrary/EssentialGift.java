package allLibrary;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *child class for Essential Gifts
 * @author RAKA
 */
public class EssentialGift extends Gifts{

    /**
     * constructor for gift class
     * @param name name of gift
     * @param price price of gift
     * @param value value of gift
     */
    public EssentialGift(String name,int price,int value){
        super("Essential",name,price,value);
    }
    
}
