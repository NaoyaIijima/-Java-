import java.io.*;

public class Main{
    public static void main(String[] args){
        // FileWriter fw = new FileWriter("data.txt"); // コンパイルエラー
        try{
            FileWriter fw = new FileWriter("data.txt");
        }catch(IOException e){
            System.out.println("An error occured.");
        }finally{
            fw.close();
        }
    }
}