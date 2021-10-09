
public class Main10 {
    public static void main(String[] args) {
        //【乱数　random】
        //int型の変数rを宣言　新規でランダムクラスを指定　次の行から範囲を指定（０以上、９０未満）
        // →ランダムで生成された値を変数ｒに代入
        // int r = new java.util.Random().nextInt(90);
        // System.out.println("あなたの年齢はたぶん、、" + r + "ですね？");

/*
入力された値の受け取り
        文字列での受け取り
        String s = new java.util.Scanner(System.in).nextLine();
        数値での受け取り
        int input = new java.util.Scanner(System.in).nextInt();

 */
        System.out.println("名前の入力をしてください。");
        String name = new java.util.Scanner(System.in).nextLine();
        //変数nameに標準入力の値を格納

        System.out.println("次に年齢を入力してください。");
        int age = new java.util.Scanner(System.in).nextInt();
        //変数ageに年齢を格納

        System.out.println("ようこそ、" + age + "歳の" + name + "さん");

    }
}
