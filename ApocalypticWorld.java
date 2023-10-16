public class ApocalypticWorld{
    public static void main(String[] args){
        Zombie zombie1 = new Zombie("Bob"); 
        System.out.println("Name: " + zombie1.name);
        System.out.println("Anger level: " + zombie1.get_attribute_level("anger"));
        zombie1.set_attribute_level(30, "anger");
        System.out.println("Anger level: " + zombie1.get_attribute_level("anger"));
    }
}