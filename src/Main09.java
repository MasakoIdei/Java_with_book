/*
Mathクラス = 数値処理を実行するためのメソッドがまとめられたクラス
abs　　１つの数値の絶対値
max　　２つを比較して、より大きい値
min　　２つを比較して、より小さい値
ceil   切り上げた値
floor　切り下げた値
round　四捨五入した値
pow　　累乗
sqrt  平方根
cbrt  立方根
 */
public class Main09 {
    public static void main(String[] args) {
        //-16の絶対値は？？
        int absolute_value = Math.abs(-16);
        System.out.println(absolute_value);
        //=> System.out.println(Math.abs(-16)); でも可

        //2と5を比較
        int a = 2;
        int b = 5;
        int bigger = Math.max(a,b); //大きい値を代入
        int smaller = Math.min(a,b); //小さい値を代入
        System.out.println(a + "と" + b + "を比較したときに大きい方は"+ bigger + "です。");
        System.out.println("小さい方は" + smaller + "です。");

        //11.5を切り上げ、切り下げ、四捨五入
        double number = 11.5;
        System.out.println(Math.ceil(number)); //切り上げ → 12.0
        System.out.println(Math.floor(number)); //切り下げ → 11.0
        System.out.println(Math.round(number)); //四捨五入 →　12

        //３の４乗は？？（累乗）
        System.out.println(Math.pow(3,4));

        //平方根

        //立方根
    }
}
