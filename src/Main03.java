/*
【定数について】
　絶対に上書きされたくない、内容が書き換えられたら困るときにしようするもの。
　例えば、計算をするときに
　円周率　pi = 3.14;　で固定して計算したかったのに
　変数pi　を使ってたことを忘れて違う数値を代入してしまって計算結果がおかしくなった…みたいなことを防げる。
　Javaで定数を使う時は、「final」を使用する。
　final 型　使用したい定数名　＝　初期値;
  ※rubyの時と一緒で定数のときは、大文字を使うのが一般的。
  定数に変更があった時、（例えば税率とか）そこだけ初期化するなどの使い方にも便利。
 */

public class Main03 {
    public static void main(String[] args) {
        final double PI = 3.14; //final 型　使用したい定数名　＝　初期値;
        int pie = 5; //半径５㎝
        System.out.println("半径" + pie + "㎝の円の面積は？？");
        System.out.println(pie * pie * PI + "です。");
        //エラーが出ることを確認
//        PI = 3;
//        System.out.println(pie * pie * PI + "です。");
    }
}
