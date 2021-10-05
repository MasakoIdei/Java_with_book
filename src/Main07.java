/*
【演算の時の型の変換】
 5/2　のようなint型同士の計算　→答えもint型
 double同士の計算結果　→　double型
 double型とint型の計算だと？？　→　intをより大きな型のdoubleに変換してから計算　→　答えの型はdouble
 処理は型を揃えてから行われているらしい
 ※String+他の型だと →評価結果は、String型　例）"私の年齢は" + 23;
 */


public class Main07 {
    public static void main(String[] args) {
        double d = 8.5 / 2;  // 2 (int) → 2.0（double）に変換してから評価が行われる
        long l = 5 + 2l;
        System.out.println(d);
        System.out.println(l);
    }
}
