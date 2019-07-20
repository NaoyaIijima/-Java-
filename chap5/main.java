public class Main{
    public static void main(String[] args){
        // テーマ：メソッド
        // hello("naoya");
        // add(10, 20); // 豆知識：渡す引数は実引数，受け取る引数を仮引数という

        int i = 0; // ローカル変数

        // System.out.println(retA());
        retA(); // 戻り値を必ずしも変数で受け取る必要はない

        // オーバーロードの利用（仮引数が異なれば，同じメソッド名でも複数の定義が可能）
        // System.out.println(add(10, 20));
        // System.out.println(add(3.5, 2.7));
        // System.out.println(add("hello, ", "world!"));
        // System.out.println(add(10, 20, 30));

        // 引数や戻り値に配列をとる場合
        int [] array = {1, 2, 10};
        printArray(array);
        // for (int element : array){
        //     System.out.println(element);
        //     // element++;
        // }

        int[] array_ = makeArray(3); // arrayを再定義しようとしたら怒られた
        showArray(array_);
    }

    public static void showArray(int[] array){
        for(int element : array){
            System.out.println(element);
        }
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

    // 引数の数が違う場合のオーバーロードがある
    public static int add(int x, int y, int z){
        return x + y + z; 
    }

    // 引数に配列をとる
    // 参照渡し
    public static void printArray(int[] array){
        // for (int element : array){
        //     System.out.println(element);
        // }
        for (int i = 0; i<array.length; i++){
            array[i]++;
        }
    }

    // 戻りが配列
    public static int[] makeArray(int size){
        int[] newArray = new int[size];
        for (int i=0; i<size; i++){
            newArray[i] = i;
        }

        return newArray;
    }

}
