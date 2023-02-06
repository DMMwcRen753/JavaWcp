
public class Variable01 {
	// ↓メソッドブロックの始まり
	public static void main(String[] args) {
		// ↓メソッドの処理を記述
		int num1; // int型の変数num1を宣言
		String str1; // string型の変数str1を宣言
		num1 = 10; // num1を初期化
		str1 = "Hello,World!"; // str1を初期化
		System.out.println(num1); // 変数num1を文字列として出力
		System.out.println(str1); // 変数str1を文字列として出力
		
		num1 = 20; // num1に20を再代入
		System.out.println(num1); // 再代入した変数num1を文字列として出力
		
		int num2 = 30; // int型の変数num2を宣言すると同時に初期化
		System.out.println(num2); // 変数num2を文字列として出力
	}

}
