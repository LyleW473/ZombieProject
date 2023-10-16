public class Zombie{ 
    public String name;
    private int angerLevel = 0;
    private int hungerLevel = 0;
    private int decompositionLevel = 0;
    
    // Constructor
    public Zombie(String initialName){
        name = initialName;
    }
    
    // Get any attribute value
    public int getAttributeLevel(String attribute_name){
        if (attribute_name.equals("anger")){
            return angerLevel;
        }
        else if (attribute_name.equals("hunger")){
            return hungerLevel;
        }
        else if (attribute_name.equals("decomposition")){
            return decompositionLevel;
        }
        else {
            // Attribute not found
            return -100;
        }
    }
    
    // Set any attribute value
    public void setAttributeLevel(int newLevelValue, String attribute_name){
        
        if (attribute_name.equals("anger")){
            if (checkInRange(newLevelValue)){
                angerLevel = newLevelValue;
            }
        }
        else if (attribute_name.equals("hunger")){
            if (checkInRange(newLevelValue)){
                hungerLevel = newLevelValue;
            }
        }
        else if (attribute_name.equals("decomposition")){
            if (checkInRange(newLevelValue)){
                decompositionLevel = newLevelValue;
            }
            
        else {
            System.out.println("Nothing changed");
        }
        }
 
    }
    
    // Validation for values
    public boolean checkInRange(int value_to_check){
        if (value_to_check >= 0 && value_to_check <= 100){
            return true;
        }
        return false;
    }

    // Print values of attributes for this zombie
    public void printAttributes(){
        System.out.println("Name: " + this.name);
        System.out.println("Hunger level: " + this.getAttributeLevel("hunger"));
        System.out.println("Anger level: " + this.getAttributeLevel("anger"));
        System.out.println("Decomposition level: " + this.getAttributeLevel("decomposition"));
        System.out.println();
    }

}
    
