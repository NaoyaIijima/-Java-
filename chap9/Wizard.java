public class Wizard{
    String name;
    int hp;
    void heal(Hero h){
        h.jp += 10;
        System.out.println(h.name + " is recover 10 HP.");
    }
}