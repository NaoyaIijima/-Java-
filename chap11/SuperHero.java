public class SuperHero extends Hero{
    
    private boolean flying;

    public SuperHero(){
        super(); // YOU MUST WRITE THIS CODE.
        System.out.println("SuperHero's constructor is running.");
    }

    public void fly(){
        this.flying = true;
        System.out.println("flying!");
    }

    public void land(){
        this.flying = false;
        System.out.println("landing.");
    }

    public void run(){
        System.out.println("tettai.");
    }

    public void attack(Matango m){
        super.attack(m);
        if(this.flying){
            super.attack(m);
        }
    }

}