package allLibrary;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *child class for Miser Boys
 * @author RAKA
 */
public class MiserBoy extends Boys{

    /**
     * constructor for boy class
     * @param name name of boy
     * @param attractive attractiveness of boy
     * @param budget total budget of boy
     * @param intelligence intelligence of boy
     * @param is_commited is the boy committed or not
     */
    public MiserBoy(String name,int attractive,int budget,int intelligence,int is_commited){
        super("Miser",name,attractive,budget,intelligence,is_commited);
    }
    
    /**
     * @param totalcost total cost of gift
     * method to calculate boy's happiness
     */
    public void calc_boy_happiness(int totalcost){
        set_boy_happiness(get_budget() - totalcost);
        
    }
}
