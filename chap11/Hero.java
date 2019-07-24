public class Hero{
    private String name = "Minato";
    private int hp = 100;

    public void attack(Matango m){
        System.out.println(this.name + " attack!!!");
        m.hp -= 5;
        System.out.println("5 points damage.");
    }

    public void run(){
        System.out.println(this.name + " is running.");
    }
}