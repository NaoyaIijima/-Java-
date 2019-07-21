public class Main{
    public static void main(String[] args){
        // Generate Hero instance
        Hero h = new Hero();

        // Set initial values of fields
        h.name = "Minato";
        h.hp = 100;
        System.out.println("Hero " + h.name + "is generated!");

        // Call methods
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
    }
}
