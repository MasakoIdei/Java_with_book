/*
関係演算子
条件分岐とよく組み合わせる
「==」や「!=」「>=」　など。
比較した時の値が成立している時　→true
成立しないときは　→false
繰り返し文のwhileとかは、条件式がtrueの間は繰り返すという処理がされているため、
計算式（a + b）や（b=3）みたいに、結果がtrue/falseで返せない物は使えない。
じゃあ、文字列の比較をしたいときは？？　→　Main12を参照
 */

public class Main11 {
    public static void main(String[] args) {
        boolean wether = true;

        //もしも、変数がtrueの場合は{}で囲まれている範囲の以下を実行
        if (wether == true){
            System.out.println("洗濯をしよう");
            System.out.println("散歩をしよう");

        //変数がfalseの場合は以下を実行
        } else {
            System.out.println("今日は雨だし、DVDでも見ようかな？");
        }
    }
}

/*
【補足】
trueの方の処理は、「洗濯をしよう」と「散歩をしよう」をそれぞれ表示しよう
→　実行したい処理は２つのため、実行したい内容を{}で囲むのは必須

elseの方は、
結果が２択 && 実行したい処理が一つだけのため、{}を省略できる　※ただし、ミス防止のために省略しない事が多いらしい…

【同じ＝だけど、意味は違うから注意】
wether = true;　→変数 wetherに値を代入している
wether == true　→変数 wetherに格納されている値は、trueと等しい？？
 */
