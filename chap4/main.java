public class Main{
    public static void main(String[] args){
        // 配列の作成1
        int[] score;
        score = new int[5];
        // 配列の作成2
        int[] scores = new int[5];
        // System.out.println(scores.length);
        // System.out.println(scores[0]);

        // 配列の初期化
        int[] scores2 = new int[]{1, 2, 3, 4, 5};
        // int[] scores = {1, ...} も可
        // System.out.println(scores2[5]); // 例外：java.lang.ArrayIndexOutOfBoundsExceptionが発生

        // 拡張for文
        for (int value : scores2){
            System.out.println(value);
        }

        // ブロック内での配列の宣言
        boolean b = true;
        if (b == true){
            int[] i = {1, 2, 3};
            System.out.println(i[0]);
        }
        // System.out.println(i[0]); // iの寿命はブロック内までなのでコンパイルエラーになる
        // 確保されていたメモリ（ゴミ）はjavaが勝手にメモリ解放してくれる

        // nullの使い方
        int[] a = {1, 2, 3};
        a = null; // aの先頭アドレスをなくす（どこも参照していない状態） = "参照を切る"
        // a[0] = 10; // 例外：java.lang.NullPointerExceptionでコンパイルエラー

        // 多次元の配列
        System.out.println("多次元配列");
        int[][] multi_array = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(multi_array.length);
        System.out.println(multi_array[0].length);
        // System.out.println(multi_array[0]); // 複数の要素を同時に表示させる方法が分からない
    }
}