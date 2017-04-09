package ass5;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import allLibrary.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAKA
 */
public class BasicCouple extends CoupleFormation{
    /**
     * constructor for BasicCouple class
     * @param boyArray array of boys
     * @param girlArray array of girls
     * @param noOfGirls number of girls in array
     * @param noOfBoys number of boys in array
     */
    public BasicCouple(Boys[] boyArray,Girls[] girlArray,int noOfGirls,int noOfBoys){
        super(boyArray,girlArray,noOfGirls,noOfBoys);
    }
    /**
     * make couple in simple order
     */
    public void make_couple(){
        int i;
        int j;
        Timestamp tmstamp = new Timestamp(System.currentTimeMillis());
        try{
            PrintWriter writer1 = new PrintWriter("GiftsExchanged.txt");
            for(i = 0;i < noOfGirls ; i++){
                for(j = 0;j < noOfBoys ; j++){
                    if(girlArray[i].get_maintain() < boyArray[j].get_budget() && girlArray[i].get_commited() != 1 && boyArray[j].get_commited() != 1){
                    boyArray[j].set_commited(1);
                    girlArray[i].set_commited(1);
                    coupleArray.add(new Couple(boyArray[j],girlArray[i]));    
                    break;
                    }
                }
           }
            writer1.close();
        }
        catch (IOException e){
            
        }
    }
}
