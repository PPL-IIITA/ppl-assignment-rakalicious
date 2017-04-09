package ass7;
import java.util.ArrayList;
import allLibrary.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *class for storing couples in sorted array structure
 * @author RAKA
 */
public class CoupleAlgoSortedArray extends CoupleAlgo{
    Couple[] processedCoupleArray;
    /**
     * constructor for CoupleAlgoSortedArray class
     * @param coupleArray array of couples formed
     */
    public CoupleAlgoSortedArray(ArrayList<Couple> coupleArray){
        super(coupleArray);
    }
    /**
     * method to make couples according to chosen algo
     */
    public void make_couple_structure(){
        int i;
        int j;
        Couple temp;
        processedCoupleArray = coupleArray.toArray(new Couple[coupleArray.size()]);
        for(i = 0; i < coupleArray.size() ; i++){
            for(j = 1 ; j < coupleArray.size() - i ; j++){
               
                if(processedCoupleArray[j-i].get_boy().get_name().compareTo(processedCoupleArray[j].get_boy().get_name())> 1){
                    temp = processedCoupleArray[j-1];
                    processedCoupleArray[j-1] = processedCoupleArray[j];
                    processedCoupleArray[j] = temp;
                }
            }
        }
    }
    /**
     * method to check the girlfriend of boy 
     * @param name name of the boy
     */
    public void check_presence(String name){
        int l = 0;
        int m = 0;
        int ans = -1;
        int r = coupleArray.size() - 1;
        while(l <= r){
            m = l + (r-1)/2;
            if(processedCoupleArray[m].get_boy().get_name().compareTo(name) == 0){
                ans = m;
                break;
            }
            if(processedCoupleArray[m].get_boy().get_name().compareTo(name) < 0){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        
        if(ans == -1){
            System.out.println("This boy is not commited ");
        }
        else{
            System.out.println("This boy is commited. Girlfriend : " + processedCoupleArray[m].get_girl().get_name());
        }
    }
}
