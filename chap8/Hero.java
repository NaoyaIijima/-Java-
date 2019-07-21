public class Hero{

    // 属性
    String name;
    int hp = 10;

    
    // 以下，操作の定義
    void sleep(){
        this.hp == 100;
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
}