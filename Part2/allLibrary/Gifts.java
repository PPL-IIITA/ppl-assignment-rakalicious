package allLibrary;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *class for gifts
 * @author RAKA
 */
public class Gifts {

    private String name;
    private int price;
    private int value;
    private String type;
    /**
     * constructor for gift class
     * @param type type of gift
     * @param name name of gift
     * @param price price of gift
     * @param value value of gift
     */
    public Gifts(String type,String name,int price,int value){
        this.type = type;
        this.name = name;
        this.price = price;
        this.value = value;
    }
    
    /**
     * to set the name of the gift
     * @param name name of the gift
     */
    public void set_name(String name){
        this.name = name;
    }
    
    /**
     * to return the name of the gift
     * @return return name of the gift
     */
    public String get_name(){
        return name;
    }
    /**
     * to set the price of the gift
     * @param price price of the gift
     */
    public void set_price(int price){
        this.price = price;
    }
    /**
     * to return the price of the gift
     * @return return the price of gift
     */
    public int get_price(){
        return price;
    }
    
    /**
     * to set the value of gift
     * @param value value of gift
     */
    public void set_value(int value){
        this.value = value;
    }
    /**
     * to return the value of gift
     * @return return the value of gift
     */
    public int get_value(){
        return value;
    }
    
    /**
     * to set the type of gift ; essential luxury utility
     * @param type type of gift
     */
    public void set_type(String type){
        this.type = type;    
    }
    /**
     * to return the type of gift ; essential luxury utility
     * @return return the type of gift
     */
    public String get_type(){
        return type;
    }
}
