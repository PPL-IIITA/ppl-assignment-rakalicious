package allLibrary;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *child class for choosy Girls
 * @author RAKA
 */
public class ChoosyGirl extends Girls{

    /**
     * constructor for girl class
     * @param name name of girl
     * @param attractive attractiveness of girl
     * @param maintain_cost total maintenance cost of girl
     * @param intelligence intelligence of girls
     * @param is_commited is the girl committed or not
     */
    public ChoosyGirl(String name,int attractive,int maintain_cost,int intelligence,int is_commited){
        super("Choosy",name,attractive,maintain_cost,intelligence,is_commited);
    }
    
    /**
     * @param gifts_given list of gifts given by boy
     * @param totalcost total cost of gifts exchanged
     * calculate girl's happiness
     */
    public void calc_girl_happiness(ArrayList <Gifts> gifts_given,int totalcost){
        
        int totalvalue = 0;
            for(Gifts g : gifts_given){
                if(g.get_type().compareTo("Luxury") == 0){
                    totalvalue = totalvalue + g.get_value();
                }
            }
            set_girl_happiness((int) Math.log(totalcost - get_maintain() + 2*totalvalue));   
    }
}
