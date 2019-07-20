package calcapp.main;

// File name == Class name
public class Main{
    public static void main(String[] args){
        int a = 10; int b = 2;
        int total = calcapp.logics.CalcLogic.tasu(a, b);
        int delta = calcapp.logics.CalcLogic.hiku(a, b);
        System.out.println("added: " + total +  ", subbed: " + delta);
        // CalcLogic.hiku(a, b);

    }
}