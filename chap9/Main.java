public class Main{
    public static void main(String[] args){

        Hero.setRandomMoney();
        System.out.println(Hero.money);
        Hero h1 = new Hero();
        System.out.println(h1.money);

        // Sword s = new Sword();
        // s.name = "fire sword";
        // s.damage = 10;

        // Generate Hero instance
        // Hero h1 = new Hero("Minato"); // name = "Minato" is error
        // Set initial values of fields
        // h1.name = "Minato";
        // System.out.println("HP is " + h1.hp);
        // System.out.println("Name is " + h1.name);
        // h1.hp = 100;
        // h1.sword = s;
        // System.out.println("Current atack object is " + h.sword.name);

        // Hero h2 = new Hero();
        // h2.name = "asaka";
        // h2.hp = 100;

        // System.out.println(h1.hp);
        // System.out.println(Hero.money); // h1.money is same result
        
        // // Wizard instance
        // Wizard w = new Wizard();
        // w.name = "sugawara";
        // w.hp = 50;
        // w.heal(h1);
        // w.heal(h2);
        // w.heal(h2);

        // System.out.println(h1.name + "\'s HP is " + h1.hp);
        // System.out.println(h2.name + "\'s HP is " + h2.hp);
    }
}
