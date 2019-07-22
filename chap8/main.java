public class Main{
    public static void main(String[] args){
        // Generate Hero instance
        Hero h = new Hero();

        // Set initial values of fields
        h.name = "Minato";
        h.hp = 100;
        // System.out.println("Hero " + h.name + "is generated!");

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        // Call methods
        // h.sit(5);

        m1.run();
        m2.run();

        h.slip();
        // h.sit(25);
        h.run();
    }
}
