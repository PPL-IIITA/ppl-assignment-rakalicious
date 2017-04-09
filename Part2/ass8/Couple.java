/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass8;
/**
 *class for Couple
 * @author RAKA
 */
import allLibrary.*;
import java.io.IOException;
import java.io.*;
import java.lang.Math;
import java.sql.Timestamp;
import java.util.ArrayList;
public class Couple {
    private Boys boy;
    private Girls girl;
    private ArrayList <Gifts> gifts_given = new ArrayList <Gifts>();
    private int happiness;
    private int compatibility;
    private int totalcost = 0;
    
    private int i;
    /**
     * constructor for class gift
     * @param boy the boy in the couple
     * @param girl the girl in the couple
     */
    public Couple(Boys boy,Girls girl){
        this.boy = boy;
        this.girl = girl;
    }
    
    /**
     * to set the object corresponding to boy
     * @param boy boy in the couple
     */
    public void set_boy(Boys boy){
        this.boy = boy;
    }
    /**
     * to return the object corresponding to boy
     * @return return the boy object
     */
    public Boys get_boy(){
        return boy;
    }

    public ArrayList <Gifts> get_gifts_given(){
        return gifts_given;
    }
    
    public void set_gifts_given(ArrayList <Gifts> gifts_given){
        this.gifts_given = gifts_given;
    }
    
    /**
     * to set the object corresponding to girl
     * @param girl girl in the couple
     */
    public void set_girl(Girls girl){
        this.girl = girl;
    }
    /**
     * to return the object corresponding to girl
     * @return return the girl object
     */
    public Girls get_girl(){
        return girl;
    }
    
    /**
     * to calculate couple happiness
     */
    public void calc_couple_happiness(){
        happiness = boy.get_boy_happiness() + girl.get_girl_happiness();
    }
    /**
     * to return couple happiness
     * @return return couple happiness
     */
    public int get_couple_happiness(){
        return happiness;
    }
    
    /**
     * to calculate couple compatibility
     */
    public void calc_couple_compatibility(){
        compatibility = boy.get_budget() - girl.get_maintain() + Math.abs(boy.get_attract() - girl.get_attract()) + Math.abs(boy.get_intellig()-girl.get_intellig());
    }
    /**
     * to return couple compatibility
     * @return return couple compatibility
     */
    public int get_couple_compatibility(){
        return compatibility;
    }
    /**
     * returns total cost of gifts exchanged
     * @return total cost of gifts exchanged
     */
    public int get_total_cost(){
        return totalcost;
    }
    
    /**
     * method to set totalcost
     * @param totalcost 
     */
    public void set_total_cost(int totalcost){
        this.totalcost = totalcost;
    }
    
}
