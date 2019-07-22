public class Hero{

    String name;
    int hp = 10;
    Sword sword;

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