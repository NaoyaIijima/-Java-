public class Hero{

    private String name;
    private int hp = 10;
    Sword sword;
    static int money; // USING static!!!

    void bye(){
        System.out.println("Hero say GOODBYE...");
    }

    public String getName(){
        return this.name;
    }

    private void die(){
        System.out.println(this.name + " is died.");
        System.out.println("GAME OVER!!!");
    }


    // static method
    static void setRandomMoney(){
        Hero.money = (int) (Math.random() * 1000);
        // compile error because no instance exist 
        // System.out.println(this.name + " is initialized money..."); 
    }

    void sleep(){
        this.hp = 100;
        System.out.println(this.name + " is sleeping and recover Hit Point!!!");
    }


    void sit(int sec){
        this.hp += sec;
        System.out.println(this.name + " is sitting within" + sec + "[sec].");
        System.out.println("HP increase" + sec + "points!!!");
    }


    void slip(){
        this.hp -= 5;
        System.out.println(this.name + " is slipping...");
        System.out.println("5 points damage...");
    }


    void run(){
        System.out.println(this.name + " is running.");
        System.out.println("GAMEOVER!!!!!!!!!!!!!!!!");
        System.out.println("Final HP is " + this.hp);
    }

    public void attack(Matango m){
        System.out.println("attack!!!");
    }

    // constractor
    Hero(String name){
        this.hp = 100;
        this.name = name;
    }

    
    // Overload of constractor
    Hero(){
        this.hp = 100;
        this.name = "dummy";
    }
}