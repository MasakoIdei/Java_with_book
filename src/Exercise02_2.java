/*
以下の内容のプログラムを作成してみよう
表示：ようこそ占いの館へ
表示：あなたの名前を入力してください
入力（変数nameに格納）
表示：あなたの年齢を入力してください
入力（String型で変数ageStringに格納）
↓
ageStringの内容をint型に変更し、変数ageに代入。
０～３の乱数を作成。変数fortuneに代入。
fortuneの数値をインクリメント演算子を１増やし、１～４の乱数にする。
↓
表示；あなたの占い結果が出ました！
表示：〇歳の〇〇さん、あなたの運気番号は（乱数）です。
表示：１大吉　２中吉　３吉　４凶
 */
public class Exercise02_2 {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();

        int age = Integer.parseInt(ageString); //String　→　int型に変換
        int fortune = new java.util.Random().nextInt(4);
        fortune++ ;

        System.out.println("占いの結果が出ました！");
        System.out.println( age + "歳の" + name + "さんの運気番号は"+ fortune + "です。" );
        System.out.println("１:大吉　２:中吉　３:吉　４:凶");


    }
}
