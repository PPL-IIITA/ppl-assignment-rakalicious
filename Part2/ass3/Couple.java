/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3;
/**
 *class for Couple
 * @author RAKA
 */
import java.io.IOException;
import java.io.*;
import java.lang.Math;
import java.sql.Timestamp;
import java.util.ArrayList;
import allLibrary.*;
public class Couple {
    private Boys boy;
    private Girls girl;

    private int happiness;
    private int compatibility;
    private int totalcost = 0;
    private int totalvalue = 0;
    private ArrayList <Gifts> gifts_given = new ArrayList <Gifts>();
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
     * method to choose gift for the couple according to their type
     * @param giftArray an array of all gifts from which the boy can choose
     */
    public void choose_gift(ArrayList <Gifts> giftArray){
        i = 0;
        Timestamp tmstamp = new Timestamp(System.currentTimeMillis());
        try{
            PrintWriter writer = new PrintWriter(new FileOutputStream(new File("GiftsExchanged.txt"), true));
            writer.println("Couple : " + boy.get_name() + " " + girl.get_name());
            if(boy.get_type().compareTo("Miser") == 0){
                for(Gifts g:giftArray){
                    if(totalcost < girl.get_maintain()){
                        gifts_given.add(g);
                        writer.println(tmstamp);
                        writer.println(g.get_name());
                        
                        totalcost = totalcost + g.get_price();
                    }
                    else{
                        break;
                    }
                }
            }
            else if(boy.get_type().compareTo("Generous") == 0){
                for(Gifts g:giftArray){
                    if(totalcost < boy.get_budget()){
                        writer.println(tmstamp);
                        writer.println(g.get_name());
                        gifts_given.add(g);
                        totalcost = totalcost + g.get_price();
                    }
                    else{       
                        gifts_given.remove(i);
                        totalcost = totalcost - g.get_price();
                        break;
                    }
                }
            }
            else if(boy.get_type().compareTo("Geek") == 0){
                for(Gifts g : giftArray){
                    if(totalcost < girl.get_maintain()){
                        gifts_given.add(g);
                        writer.println(tmstamp);
                        writer.println(g.get_name());
                        totalcost = totalcost + g.get_price();
                        i++;
                    }
                    else{
                        break;
                    }
                }
                for(Gifts g : giftArray){
                    if(i > 0){
                        i--;
                    }
                    else{
                        if(g.get_type().compareTo("Luxury") == 0){
                            if(boy.get_budget() - totalcost >= g.get_price()){
                            gifts_given.add(g);
                            writer.println(tmstamp);
                            writer.println(g.get_name());
                            totalcost = totalcost + g.get_price();
                            }
                            break;
                        }
                    }
                }
            }
            writer.println();
            writer.close();
        }
        catch (IOException e){
        }
    }
    /**
     * returns list of gifts exchanged
     * @return gifts list of gifts exchanged between couples
     */
    public ArrayList <Gifts> get_gifts_given(){
        return gifts_given;
    }
    
    /**
     * returns total cost of gifts exchanged
     * @return total cost of gifts exchanged
     */
    public int get_total_cost(){
        return totalcost;
    }
}
