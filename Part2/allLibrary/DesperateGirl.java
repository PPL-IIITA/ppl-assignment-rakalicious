package allLibrary;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *child class for Desperate Girls
 * @author RAKA
 */
public class DesperateGirl extends Girls{

    /**
     * constructor for girl class
     * @param name name of girl
     * @param attractive attractiveness of girl
     * @param maintain_cost total maintenance cost of girl
     * @param intelligence intelligence of girls
     * @param is_commited is the girl committed or not
     */
    public DesperateGirl(String name,int attractive,int maintain_cost,int intelligence,int is_commited){
        super("Desperate",name,attractive,maintain_cost,intelligence,is_commited);
    }
    
    /**
     * @param totalcost total cost of gifts exchanged
     * calculate girl's happiness
     */
    public void calc_girl_happiness(int totalcost){
        set_girl_happiness((int) Math.exp((totalcost - get_maintain())%10));
    }
}
