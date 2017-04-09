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
public class SpecialCouple extends CoupleFormation{
    /**
     * constructor for SpecialCouple class
     * @param boyArray array of boys
     * @param girlArray array of girls
     * @param noOfGirls number of girls in array
     * @param noOfBoys number of boys in array
     */
    public SpecialCouple(Boys[] boyArray,Girls[] girlArray,int noOfGirls,int noOfBoys){
        super(boyArray,girlArray,noOfGirls,noOfBoys);
    }
    
    Girls[] girlToChooseFrom = null;
    /**
     * make couples in special way chosen
     */
    public void make_couple(){
        try{
            Timestamp tmstamp = new Timestamp(System.currentTimeMillis());
            int i;
            int j;
            int l;
            int k;
            PrintWriter writer1 = new PrintWriter("GiftsExchanged.txt");
            girlToChooseFrom = new Girls[noOfGirls];
            for(l = 0 ; l < noOfGirls ; l++){
                girlToChooseFrom[l] = girlArray[l];
            }
            //sorting boys wrt attractiveness
            Boys temp;
            for(i = 0; i < noOfBoys ; i++){
                for(j = i ; j <noOfBoys ; j++){
                    if(boyArray[i].get_attract() < boyArray[j].get_attract()){
                        temp = boyArray[i];
                        boyArray[i] = boyArray[j];
                        boyArray[j] = temp;
                    }
                }
            }
            
            Girls temp1;
            //sorting girls wrt maintainance cost
            for(i = 0; i < noOfGirls ; i++){
                for(j = i ; j <noOfGirls ; j++){
                    if(girlArray[i].get_maintain() < girlArray[j].get_maintain()){
                        temp1 = girlArray[i];
                        girlArray[i] = girlArray[j];
                        girlArray[j] = temp1;
                    }
                }
            }
            //sorting girls wrt attractiveness
            for(i = 0; i < noOfGirls ; i++){
                for(j = i ; j <noOfGirls ; j++){
                    if(girlToChooseFrom[i].get_attract() < girlToChooseFrom[j].get_attract()){
                        temp1 = girlToChooseFrom[i];
                        girlToChooseFrom[i] = girlToChooseFrom[j];
                        girlToChooseFrom[j] = temp1;
                    }
                }
            }
        
            i = 0;
            j = 0;
            k = 0;
            while(k != 10){
                while(girlArray[i].get_commited() == 1){
                    if(i == noOfGirls - 1){
                        break;
                    }
                    i++;
                }
                for(l = 0; l < noOfBoys ; l++){
                    if(girlArray[i].get_maintain() < boyArray[l].get_budget() && boyArray[l].get_commited() == 0){
                        boyArray[l].set_commited(1);
                        girlArray[i].set_commited(1);
                        coupleArray.add(new Couple(boyArray[l],girlArray[i]));
                        k++;
                        break;
                    }
                }
                
                while(boyArray[j].get_commited() == 1){
                    if(j == noOfBoys - 1){
                        break;
                    }
                    j++;
                }
                for(l = 0 ; l < noOfGirls ; l++){
                    if(girlToChooseFrom[l].get_maintain() < boyArray[j].get_budget() && girlToChooseFrom[l].get_commited() == 0){
                        boyArray[j].set_commited(1);
                        girlToChooseFrom[l].set_commited(1);
                        coupleArray.add(new Couple(boyArray[j],girlToChooseFrom[l]));
                        k++;
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
