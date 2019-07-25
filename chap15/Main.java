import java.io.*;
import java.util.Date;

public class Main{
    public static void main(String[] args){
        // // FileWriter fw = new FileWriter("data.txt"); // コンパイルエラー
        // try{
        //     FileWriter fw = new FileWriter("data.txt");
        // }catch(IOException e){
        //     System.out.println("An error occured.");
        // }finally{ // MUST WRITE WHEN YOU USE FILEIO and NETWORK CONNECTION.
        //     fw.close();
        // }

        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
    }
}