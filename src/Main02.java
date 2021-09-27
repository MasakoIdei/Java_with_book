//変数について
//変数とは　→データを格納する為に、用意する入れ物（箱）のようなもの
//変数を宣言する時には、データ型（変数の種類や大きさ）と　変数名を指定する。
//データ型を指定することで、この変数に入れられるデータは数字だけとか文字だけとかが決まるため、指定された型以外の物は代入できなくなる。

//変数名で使用できるアルファベット、数字、_＄などの記号を【識別子】と呼ぶ
//予約語が存在している、大文字小文字は区別されるという所、出来る限り内容が想像しやすい単語を使用する所はrubyの時と一緒。
//基本的には、小文字で始まる名前にする事が多い。
//単語をつなげた変数名なら、後ろの単語を大文字にして区切りが分かりやすいようにするらしい。 例。myAge

public class Main02 {
    public static void main(String[] args) {
        int age;   //int型ageという変数を用意する(変数宣言)
        age = 30;  //変数の中に３０という数字を代入する(初期化する)
        System.out.println("年齢は" + age + "です"); //変数を取得して表示する

        int test = 22;  //宣言 + 初期化　という省略した書き方も出来る。
        System.out.println("代入した値は、" + test + "です。");

    }
}

//データ型について
//大きく区切った場合、「プリミティブ型」と「参照型」に2種類に分けれる。

/*
primitiveとは？　
→原始的な物、原型、初期のなどの意味がある。
【プリミティブ型】
最初から用意されている代表的な、基本の型ということで、
「プリミティブ型」。基本データ型と呼んだりもするらしい。
冷蔵庫は食品を入れるための箱だし、ごみ箱はごみを入れる箱、筆箱は筆記用具を入れる箱と使い分けているみたいに
数字は数字用の、文字列には文字用の箱が用意されている。
代表的な８種類
・整数を格納できる　→　byte, shot, int, long　
・小数を格納できる　→　float, double
・一文字だけ格納できる →　char
・真偽の結果を格納できる　→ boolean
　これを使い分けることで、数字用の箱に間違えて数字を格納してしまうことの防止が出来る。
　それぞれbit数が違う。
  最近は、int型を使用した方が処理が早かったりするものもあるらしいため、どれを使った方がいいのかは現場による

【参照型】
　参照変数型、クラス型などとも呼ばれることがあるらしい。
 データそのものではなく、データのある場所からデータを参照してくる。
 プリミティブ型以外のこと。
　Excelのセルを指定する時みたいに、どこの列の何行目にあるデータが欲しいと指定して
　利用する感じらしい。
　頭文字は大文字。
　String型や配列などがそれにあたるらしい。

【補足】
  char と　Stringの違いは？？
  charは文字。
  文字そのもののこと。Unicodeからなる数字そのもの。文字コード。

  Stringは、文字列のこと
  らしい。

  　※Unicodeは、世界共通の文字を番号化（一文字を表す0～65535の数字）したもの。
  　　『文字』と『文字に割り当てた番号』の対応表。
  　　コンピュータ内では、文字も01の組み合わせで出来ているから
  　　例えば、あ＝00000001　い＝00000010　と事前に決めておいて
  　　この文字はこの数字、この文字はこの数字とコンピュータが扱えるようにしている。
  　　でも、皆でバラバラの数字と文字を使用していたら分かりづらいよね？
  　　みんな共通の対応表があるといいよね？　という感じで決められていった
  　　文字集合したグループ名の一つ。符号化文字集合とも言ったりするらしい。  　　
 */
/*
【float, doubleの違い】
float
→　少し曖昧でもいい小数
doubleに比べて必要なメモリが少ない（32bit）＝　処理が早くなる
　 　　　　
boudle　
→　普通の小数
doubleの方がメモリ数が大きい（６４bit）＝　処理する桁が大きくなるから、floatに比べると処理が遅くなる。
floatと比べ、より計算が正確に出来る。

メモリの節約をしたいとき、そんなに正確では無くていいからとにかく早く処理したい時は、float
を使うけど、特に理由がないときは、boudleの方がいいらしい。
ただ、最近は浮動小数演算器やPCのスペックだとかの関係で、
boudleの方が実は計算速度が早いかも？みたいな時はあるらしい。

※使う時の注意点
どちらも浮動小数点数だから、正確な計算は出来ない。
必ず誤差が出てしまうから、○○より大きいみたいな比較や大体の計算は出来るけど
A=Bみたいに同じかどうかを比較したいときや、
正確性が大事な計算には向かないらしい。（お金関係は金額が大きいほど誤差の影響も大きいから）

浮動小数点数ってなんぞ？
人間から見たら　0.3　という認識でも
機械語に翻訳したものを再翻訳したときに、　0.3　だったり　0.30003　になってしまうらしい。
外国語の翻訳をした時に、日本には存在しない言葉だったからニュアンスで翻訳はしたけど
再翻訳したらなんか違う感じになってしまう…みたいな感じが近いのかな？？

機械に分かる言葉＝バイナリ＝電気のありなしを０１で表している（２進法）
0.1（１０進法）を２進法に直した時　＝　0.00011001100110011001……
０１だと、「.」は表現できない
ちょっとした計算でも小数が長くなりすぎてしまうから使いづらい
みたいなことから小数は表現できないってなるらしい。
解決法として、「.」の前の部分と後ろの部分に分解してそれぞれ計算して
それっぽい数字を出してるらしい？
指数部、仮数部




 */


