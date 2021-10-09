public class Exercise02 {
    public static void main(String[] args) {
        //次のプログラムを「x+yは１５」表示できるように修正してみよう
        int x = 5;
        int y = 10;
//      String ans = "x+yは" + x + y;　→　x+yは５１０
//      上の書き方だと、すべて文字列扱いになるから単純に短文をくっつけた結果が表示されていた。　
        String ans = "x+yは" + (x + y);
        System.out.println(ans);
    }
}
