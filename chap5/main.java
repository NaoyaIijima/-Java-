public class Main{
    public static void main(String[] args){
        // テーマ：メソッド
        // hello("naoya");
        add(10, 20); // 豆知識：渡す引数は実引数，受け取る引数を仮引数
    }
    // 名前を表示するメソッド
    public static void hello(String name){
        System.out.println("hello, " + name);
    }
    // 引数を複数取る場合
    public static void add(int n1, int n2){
        int ans = n1 + n2;
        System.out.println(ans);
    }
}