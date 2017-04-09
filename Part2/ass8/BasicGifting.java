package ass8;
import allLibrary.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *class for basic gifting
 * @author RAKA
 */
public class BasicGifting implements GiftAllocate{
    int i;
    private ArrayList <Gifts> gifts_given = new ArrayList <Gifts>();
    private int totalcost = 0;
    /**
     * method to choose gift for the couple according to their type
     * @param giftArray an array of all gifts from which the boy can choose
     */
    public void choose_gift(Couple c , ArrayList <Gifts> giftArray){
        i = 0;
        Timestamp tmstamp = new Timestamp(System.currentTimeMillis());
        try{
            PrintWriter writer;
            writer = new PrintWriter(new FileOutputStream(new File("GiftsExchanged.txt"), true));
            
            writer.println("Couple : " + c.get_boy().get_name() + " " + c.get_girl().get_name());
            if(c.get_boy().get_type().compareTo("Miser") == 0){
                for(Gifts g:giftArray){
                    
                    if(totalcost < c.get_girl().get_maintain()){
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
            else if(c.get_boy().get_type().compareTo("Generous") == 0){
                for(Gifts g:giftArray){
                    if(totalcost < c.get_boy().get_budget()){
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
            else if(c.get_boy().get_type().compareTo("Geek") == 0){
                for(Gifts g : giftArray){
                    if(totalcost < c.get_girl().get_maintain()){
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
                            if(c.get_boy().get_budget() - totalcost >= g.get_price()){
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
            c.set_gifts_given(gifts_given);
            c.set_total_cost(totalcost);
            writer.println();
            writer.close();
            
        }
        catch (IOException e){
        }
        
    }
    
    
}
