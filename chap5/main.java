public class Main{
    public static void main(String[] args){
        // テーマ：メソッド
        // hello("naoya");
        // add(10, 20); // 豆知識：渡す引数は実引数，受け取る引数を仮引数という

        int i = 0; // ローカル変数

        // System.out.println(retA());
        retA(); // 戻り値を必ずしも変数で受け取る必要はない

        // オーバーロードの利用（仮引数が異なれば，同じメソッド名でも複数の定義が可能）
        System.out.println(add(10, 20));
        System.out.println(add(3.5, 2.7));
        System.out.println(add("hello, ", "world!"));
    }

    // 名前を表示するメソッド
    public static void hello(String name){
        System.out.println("hello, " + name);
    }

    // 引数を複数取る場合
    public static int add(int x, int y){
        int i; // mainメソッド内のiとは別の変数
        // int ans = x + y; // ローカル変数
        // System.out.println(ans);
        return x + y;
    }

    // 戻り値の利用
    public static String retA(){
        return "naoya!!!";
        // int i = 0; // コンパイルエラー
    }

    // オーバーロード
    public static double add(double x, double y){
        return x + y;
    }
    public static String add(String x, String y){
        return x + y;
    }

}
