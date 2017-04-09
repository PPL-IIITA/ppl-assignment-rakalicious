/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allLibrary;
/**
 *class for boys
 * @author RAKA
 */
public class Boys {

    private String type;
    private String name;
    private int attractive;
    private int budget;
    private int intelligence;
    private int is_commited;
    private int boy_happiness;
    
    /**
     * constructor for boy class
     * @param type type of boy
     * @param name name of boy
     * @param attractive attractiveness of boy
     * @param budget total budget of boy
     * @param intelligence intelligence of boy
     * @param is_commited is the boy committed or not
     */
    public Boys(String type,String name,int attractive,int budget,int intelligence,int is_commited){
        this.type = type;
        this.name = name;
        this.attractive = attractive;
        this.budget = budget;
        this.intelligence = intelligence;
        this.is_commited = is_commited;
    }
    
    /**
     * to set the name of the boy
     * @param name name of the boy
     */
    public void set_name(String name){
        this.name = name;    
    }
    /**
     * to return the name of the boy
     * @return name of boy
     */
    public String get_name(){
        return name;
    }
    
    /**
     * to set the attractiveness of boy
     * @param attractive attractiveness of boy
     */
    public void set_attract(int attractive){
        this.attractive = attractive;
    }
    /**
     * to return the attractiveness of boy
     * @return return value of attractiveness at a scale of 1 to 100
     */
    public int get_attract(){
        return attractive;
    }
    
    /**
     * to set the budget of boy
     * @param budget budget of boy
     */
    public void set_budget(int budget){
        this.budget = budget;
    }
    /**
     * to return the budget of boy
     * @return the value of budget ranging from 400 to 1000
     */
    public int get_budget(){
        return budget;
    }
    /**
     * to set the intelligence of boy
     * @param intelligence intelligence of boy
     */
    public void set_intellig(int intelligence){
        this.intelligence = intelligence;
    }
    /**
     * to return the intelligence of boy 
     * @return return the intelligence of boy on a scale of 1 to 100 
     */
    public int get_intellig(){
        return intelligence;
    }
    
    /**
     * to set if the boy is committed or not ;1 - committed 0 - not committed
     * @param is_commited is the boy committed or not
     */
    public void set_commited(int is_commited){
        this.is_commited = is_commited;
    }
    /**
     * to return if the boy is committed or not
     * @return 1 - committed 0 - not committed
     */
    public int get_commited(){
        return is_commited;
    }
    
    /**
     * to st boys happiness
     * @param happiness happiness of boy
     */
    public void set_boy_happiness(int happiness){
        this.boy_happiness = happiness;
    }
    
    /**
     * to return boy's happiness
     * @return return boy's happiness
     */
    public int get_boy_happiness(){
        return boy_happiness;
    }
    
    /**
     * to set the type of boy ; miser generous geeks
     * @param type type of boy
     */
    public void set_type(String type){
        this.type = type;    
    }
    /**
     * to return the type of boy ; miser generous geeks
     * @return return the type of boy
     */
    public String get_type(){
        return type;
    }
}
