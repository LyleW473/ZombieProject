public class Zombie{ 
    public String name;
    private int anger_level = 0;
    private int hunger_level = 0;
    private int decomposition_level = 0;
    
    // Constructor
    public Zombie(String initial_name){
        name = initial_name;
    }
    
    // Get any attribute value
    public int get_attribute_level(String attribute_name){
        if (attribute_name.equals("anger")){
            return anger_level;
        }
        else if (attribute_name.equals("hunger")){
            return hunger_level;
        }
        else if (attribute_name.equals("decomposition")){
            return decomposition_level;
        }
        else {
            // Attribute not found
            return -100;
        }
    }
    
    // Set any attribute value
    public void set_attribute_level(int new_level_value, String attribute_name){
        
        if (attribute_name.equals("anger")){
            if (check_in_range(new_level_value)){
                anger_level = new_level_value;
            }
        }
        else if (attribute_name.equals("hunger")){
            if (check_in_range(new_level_value)){
                hunger_level = new_level_value;
            }
        }
        else if (attribute_name.equals("decomposition")){
            if (check_in_range(new_level_value)){
                decomposition_level = new_level_value;
            }
            
        else {
            System.out.println("Nothing changed");
        }
        }
 
    }
    
    // Validation for values
    public boolean check_in_range(int value_to_check){
        if (value_to_check >= 0 && value_to_check <= 100){
            return true;
        }
        return false;
    }

}
    
