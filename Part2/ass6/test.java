/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass6;
import allLibrary.*;
import java.io.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *main class
 * @author RAKA
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // The name of the file to open.     
        new test().go();
          
    }  
    /**
     * comparator for sorting gifts based on price
     */
    public class giftComparator implements Comparator{
        public int compare(Object o1, Object o2){
            Gifts g1 = (Gifts)o1;
            Gifts g2 = (Gifts)o2;
            return Float.compare(g1.get_price(),g2.get_price());
        }
    }
    /**
     * comparator for sorting couple based on happiness
     */
    public class happinessComparator implements Comparator{
        public int compare(Object o1, Object o2){
            Couple c1 = (Couple) o1;
            Couple c2 = (Couple) o2;
            return Float.compare(c1.get_couple_happiness(),c2.get_couple_happiness());
        }
    }
    /**
     * comparator for sorting couples based on compatibility
     */
    public class compatibilityComparator implements Comparator{
        public int compare(Object o1, Object o2){
            Couple c1 = (Couple) o1;
            Couple c2 = (Couple) o2;
            return Float.compare(c1.get_couple_compatibility(),c2.get_couple_compatibility());
        }
    }
    
    
    public void go(){
        int number = 0;
        int i,j,m;
        //making an array of boys object
        String fileName = "boys.txt";
        
        String name;
        int attractive;
        int budget;
        int intelligence;
        String type;
        int maintain_cost;
        int price;
        int value;
        int luxury_rating;
        int diff_obtain;
        int utility_value;
        int utility_class;
        int noOfGirls = 0;
        int noOfBoys = 0;
        Girls[] girlArray = null;
        Boys[] boyArray = null;
        ArrayList<Gifts> giftArray = new ArrayList <Gifts>();
        ArrayList<Couple> coupleArray = new ArrayList <Couple>();
        ArrayList<Couple> coupleArrayBreakUp = new ArrayList <Couple>();
        
        String line = null;

        try {
            
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
                
            line = bufferedReader.readLine();
            number = Integer.parseInt(line);
            noOfBoys = number;
            boyArray = new Boys[number];
            i = 0;
            while((line = bufferedReader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line,",");
                
                name = st.nextToken();
                attractive = Integer.parseInt(st.nextToken());
                budget = Integer.parseInt(st.nextToken());
                intelligence = Integer.parseInt(st.nextToken());
                type = st.nextToken();
                if(type.compareTo("Miser") == 0){
                    MiserBoy b = new MiserBoy(name,attractive,budget,intelligence,0);
                    boyArray[i] = (Boys)b;
                }
                else if(type.compareTo("Generous") == 0){
                    GenerousBoy b = new GenerousBoy(name,attractive,budget,intelligence,0);
                    boyArray[i] = (Boys)b;
                }
                else if(type.compareTo("Geek") == 0){
                    GeekBoy b = new GeekBoy(name,attractive,budget,intelligence,0);
                    boyArray[i] = (Boys)b;
                }
                i++;
            }   
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }
        //making an array of girls object
        fileName = "girls.txt";
        line = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
                
            line = bufferedReader.readLine();
            number = Integer.parseInt(line);
            noOfGirls = number;
            girlArray = new Girls[number];
            i = 0;
            while((line = bufferedReader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line,",");
                name = st.nextToken();
                attractive = Integer.parseInt(st.nextToken());
                maintain_cost = Integer.parseInt(st.nextToken());
                intelligence = Integer.parseInt(st.nextToken());
                type = st.nextToken();
                if(type.compareTo("Choosy") == 0){
                    ChoosyGirl g = new ChoosyGirl(name,attractive,maintain_cost,intelligence,0);
                    girlArray[i] = (Girls)g;
                }
                else if(type.compareTo("Normal") == 0){
                    NormalGirl g = new NormalGirl(name,attractive,maintain_cost,intelligence,0);
                    girlArray[i] = (Girls)g;
                }
                else if(type.compareTo("Desperate") == 0){
                    DesperateGirl g = new DesperateGirl(name,attractive,maintain_cost,intelligence,0);
                    girlArray[i] = (Girls)g;
                }                
                i++;                    
            }   
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
        //making an array of gifts object
        fileName = "gifts.txt";
        line = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            number = Integer.parseInt(line);
            i = 0;
            while((line = bufferedReader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line,",");
                type = st.nextToken();
                if(type.compareTo("Essential") == 0){
                    EssentialGift g;
                    name = st.nextToken();
                    price = Integer.parseInt(st.nextToken());
                    value = Integer.parseInt(st.nextToken());
                    g = new EssentialGift(name,price,value);
                    giftArray.add((Gifts)g);
                }
                else if(type.compareTo("Luxury") == 0){
                    LuxuryGift g;
                    name = st.nextToken();
                    price = Integer.parseInt(st.nextToken());
                    value = Integer.parseInt(st.nextToken());
                    luxury_rating = Integer.parseInt(st.nextToken());
                    diff_obtain = Integer.parseInt(st.nextToken());
                    g = new LuxuryGift(name,price,value,luxury_rating,diff_obtain);
                    giftArray.add((Gifts)g);
                }
                else if(type.compareTo("Utility") == 0){
                    UtilityGift g;
                    name = st.nextToken();
                    price = Integer.parseInt(st.nextToken());
                    value = Integer.parseInt(st.nextToken());
                    utility_value = Integer.parseInt(st.nextToken());
                    utility_class = Integer.parseInt(st.nextToken());
                    g = new UtilityGift(name,price,value,utility_value,utility_class);
                    giftArray.add((Gifts)g);
                }
                i++;    
            }   
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        //linking girl and boy and make couple object
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
            writer1.println("DAY 1 :");
            writer1.close();
        }
        catch (IOException e){
            
        }
        //sorting gifts by price
        Collections.sort(giftArray,new giftComparator());
        //assigning gifts
        methodsAfterCouples(coupleArray,giftArray);
        
        //sorting couples by happiness
        Collections.sort(coupleArray,new happinessComparator());
        try{
           
            PrintWriter writer = new PrintWriter(new FileOutputStream(new File("HappinessSortedCouples.txt"), true));
            writer.println("DAY 1 :");
            for(Couple c :coupleArray){
                writer.println(c.get_boy().get_name() + " and " + c.get_girl().get_name());
                writer.println("Happiness " + c.get_couple_happiness());
            }
            writer.println();
            writer.close();
        }
        catch (IOException e){
            
        }
        
        int t = 30;
        for(m = 1; m <= t ; m++){
            coupleArrayBreakUp.clear();
            Collections.sort(coupleArray,new happinessComparator());
            
            for(Couple c : coupleArray){
                if(c.get_couple_happiness() < t){
                    c.get_girl().set_commited(0);
                    c.get_boy().set_commited(0);
                    coupleArrayBreakUp.add(c);
                    
                }
            }
        
            for(Couple c : coupleArrayBreakUp){
            
                coupleArray.remove(c);
            }
        
            for(Couple c : coupleArrayBreakUp){
                for(i = 0 ;i < noOfBoys ; i++){
                    if(c.get_girl().get_maintain() < boyArray[i].get_budget() && c.get_boy().get_name().compareTo(boyArray[i].get_name()) != 0 && boyArray[i].get_commited() == 0){
                        c.get_girl().set_commited(1);
                        boyArray[i].set_commited(1);
                        coupleArray.add(new Couple(boyArray[i],c.get_girl()));
                        break;
                    }
                }
            }
            for(Couple c : coupleArray){
                c.set_total_cost(0);
            }
            
            try{
                PrintWriter writer = new PrintWriter(new FileOutputStream(new File("GiftsExchanged.txt"), true));
                writer.println("DAY " + (m+1));
                writer.close();
            }
            catch(IOException e){
                
            }
            methodsAfterCouples(coupleArray,giftArray);
        
            //sorting couples by happiness
            Collections.sort(coupleArray,new happinessComparator());
            try{
           
                PrintWriter writer = new PrintWriter(new FileOutputStream(new File("HappinessSortedCouples.txt"), true));
                writer.println("DAY " + (m+1) + " :");
                for(Couple c :coupleArray){
                    writer.println(c.get_boy().get_name() + " and " + c.get_girl().get_name());
                    writer.println("Happiness " + c.get_couple_happiness());
                }
                writer.println();
                writer.close();
            }
            catch (IOException e){
            
            }
        }
    }
    /**
     * provides list of gifts to couples formed 
     * @param coupleArray list of couples formed
     * @param giftArray list of gifts
     */
    public void methodsAfterCouples(ArrayList <Couple> coupleArray,ArrayList <Gifts> giftArray){
        for(Couple c : coupleArray){
            c.choose_gift(giftArray);
            if(c.get_girl().get_type().compareTo("Choosy") == 0){
                ChoosyGirl g = (ChoosyGirl)c.get_girl();
                g.calc_girl_happiness(c.get_gifts_given(),c.get_total_cost());   
            }
            else if (c.get_girl().get_type().compareTo("Normal") == 0){
                NormalGirl g = (NormalGirl)c.get_girl();
                g.calc_girl_happiness(c.get_gifts_given(),c.get_total_cost());
            }
            else if (c.get_girl().get_type().compareTo("Desperate") == 0){
                DesperateGirl g = (DesperateGirl)c.get_girl();
                g.calc_girl_happiness(c.get_total_cost());
            }
            
            if(c.get_boy().get_type().compareTo("Miser") == 0){
                MiserBoy b = (MiserBoy)c.get_boy();
                b.calc_boy_happiness(c.get_total_cost());
            }
            else if (c.get_boy().get_type().compareTo("Generous") == 0){
                GenerousBoy b = (GenerousBoy)c.get_boy();
                b.calc_boy_happiness(c.get_girl().get_girl_happiness());
            }
            else if (c.get_boy().get_type().compareTo("Geek") == 0){
                GeekBoy b = (GeekBoy)c.get_boy();
                b.calc_boy_happiness(c.get_girl().get_intellig());
            }
                     
            c.calc_couple_happiness();
            
            c.calc_couple_compatibility();
        }
    }
}
