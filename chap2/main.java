import java.util.Random;

public class Main{
    public static void main(String[] args){
        int a, b;
        a = 20;
        b = 5;
        a = b = 10;
        // System.out.println(a);
        // System.out.println(b);

        // System.out.println(5 / 2.0);
        
        // System.out.print("i am ");
        // System.out.print("naoya.\n");

        // int parsed = Integer.parseInt("123");
        // System.out.println(parsed);

        // System.out.println("私の好きな記号は二重引用符（"）です．"); // これはコンパイルエラー
        // System.out.println("私の好きな記号は二重引用符（\"）です．"); // これはOK

        System.out.println(new Random().nextInt(10));

        String age = new java.util.Scanner(System.in).nextLine();
        System.out.println("your age is ... " + age);

        
    }
}
