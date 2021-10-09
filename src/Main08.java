/*
print、println
println…文字列を表示　+ 改行
print  …文字列を表示する（連続して呼び出し）
 */

public class Main08 {
    public static void main(String[] args) {
        String name = "はなこ";
        System.out.print("私の名前は、");
        System.out.print(name);
        //私の名前は、はなこ

        System.out.println("私の名前は、");
        System.out.println(name);
        //私の名前は、
        //はなこ
    }
}
