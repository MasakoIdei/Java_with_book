/*【型の変更】
　Rubyだと、文字列と数字をそのまま結合出来なかったのに
　Javaはなんで　＋　を利用しただけで結合出来るのか？
　→評価の過程で、自動的に型を変換しているから
 　※ただし、bit数を超えてしまう場合（32bitの箱に64bitの箱を入れるようなこと）は基本的には出来ない。
 　　64bitの箱に入っていたデータが32bitの箱に入りきらない可能性がある為、エラーが発生する。
 　　因みに、元のデータの一部が抜けてしまってもいいから、強制的に変換したい場合は
 　　int age = (int)3.2; 　　←小数の方がデータ量が大きいのに無理やりintに押し込め
 　　で強制代入は出来なくもないらしい。ただし、制限あり。
 　　（int）の部分はキャスト演算子
 　　箱に収まりきらない部分は、捨てられてしまうため
 　　不具合が出たりすることあるらしく、おすすめはされていないらしい。


 */

public class Main06 {
    public static void main(String[] args) {
      // floatをdoubleに代入する時に、型も変換されている
        float f = 3;
        double d = f;
        System.out.println(f);
        System.out.println(d);

      //エラーが発生するver ※大きい箱を小さい箱に押し込もうとしているためエラーが発生する
//        double d = 3;    64bit
//        float f = d;     32bit
//        System.out.println(d);
//        System.out.println(f);

        int a = 5;
        int b = 2;
        System.out.println(a / b);
        System.out.println((double)a/b);
    }
}

 /*
 →あんまり勧められていない、型の強制変換っていつ使うの？？
            int型同士の計算だと、結果もint型になるから
            5/2　みたいに小数が発生する計算のとき、小数の部分が切り捨てられてしまうらしい。
            　　　　　5/2　→評価の結果　２
            (double)5/2 →　評価の結果　2.5

  */