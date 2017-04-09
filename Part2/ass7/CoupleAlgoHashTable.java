package ass7;
import java.util.ArrayList;
import java.util.HashMap;
import allLibrary.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *class for storing couples in hash tables
 * @author RAKA
 */
public class CoupleAlgoHashTable extends CoupleAlgo{
    HashMap<String , String> hmap = new HashMap<String ,String>();
    /**
     * constructor for class CoupleAlgoHashTable
     * @param coupleArray array of couples formed
     */
    public CoupleAlgoHashTable(ArrayList<Couple> coupleArray){
        super(coupleArray);
    }
    /**
     * method to make couples according to chosen algo
     */
    public void make_couple_structure(){
        for(Couple c : coupleArray){
            hmap.put(c.get_boy().get_name(), c.get_girl().get_name());
        }
    }
    /**
     * method to check the girlfriend of boy 
     * @param name name of the boy
     */
    public void check_presence(String name){
        String ans;
        ans = hmap.get(name);
        if(ans == null){
            System.out.println("This boy is not commited ");
        }
        else{
            System.out.println("This boy is commited. Girlfriend : " + ans);
        }
    }
}
