package calcapp.main;
// add import 
import calcapp.logics.CalcLogic;

// File name == Class name
public class Main{
    public static void main(String[] args){
        int a = 10; int b = 2;

        // 以下はコンパイルには通るが，実行時にNoClassDefFoundErrorというエラーが出る
        // -> 1. java Mainとコマンドしたら，デフォルトパッケージのMainを探しに行って，
        // そんなものはないと怒られる
        // -> 2. 
        int delta = CalcLogic.hiku(a, b);
        int total = CalcLogic.tasu(a, b);
        System.out.println("added: " + total +  ", subbed: " + delta);
        // CalcLogic.hiku(a, b);
    }
}