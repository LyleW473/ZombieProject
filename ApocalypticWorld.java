import java.util.ArrayList;

public class ApocalypticWorld{
    private ArrayList<Zombie> allZombies = createZombies(); // Create attribute which is an ArrayList of references to zombie objects

    public static void main(String[] args){
        ApocalypticWorld world = new ApocalypticWorld();

        // Print attributes of each created zombie
        for (Zombie zombie:world.allZombies){
            zombie.printAttributes();
        }
    }
    
    // Create zombies
    public ArrayList<Zombie> createZombies(){
        // Create a list of zombie names
        ArrayList<String> zombieNames = new ArrayList<>();
        zombieNames.add("Lyle");
        zombieNames.add("Marge");
        zombieNames.add("Homer");
        zombieNames.add("Lisa");
        zombieNames.add("Bart");
        
        // Different way of creating a list of zombie names
        // String[] zombieNames = {"Lyle", "Marge", "Homer", "Lisa", "Bart"}; 

        // Creating a list of zombies
        ArrayList<Zombie> zombies = new ArrayList<>();
        for (String name:zombieNames){
            System.out.println("Creating Zombie with the name: "+ name);
            Zombie z  = new Zombie(name);
            zombies.add(z);
        }

        // Return list of zombies
        return zombies;
    }
}