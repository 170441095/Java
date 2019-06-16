/**
 * 基本課題1.4　メインクラス
 * @author 170441095 竹内円来
 */
import java.util.Arrays;

public class Task14 {
	//最大素数を返すメソッド
	static int check(int n) {
		boolean[] search = new boolean[n];
		int maxNum = 0;
		Arrays.fill(search, true);

		for(int i=2; i<Math.sqrt(n); i++) {
			if(!search[i])	continue;

			for(int j=2; i*j <= n-1; j++)	search[i*j] = false;
		}
		for(int i=2; i<search.length; i++){
            if(search[i]){
                maxNum = i;
            }
        }
		return maxNum;
	}

	//メインメソッド
	public static void main(String[] args) {
		//コマンドライン引数に数値が指定されていない時
		if(args.length == 0) {
			System.out.println("コマンドライン引数に数値が指定されていません. プログラムを終了します.");
			System.exit(1);	//プログラムを終了する
		}

		int num = Integer.parseInt(args[0]);	//String[]からintに変換
		//コマンドライン引数が0の時
		if(num == 0) {
			System.out.println("コマンドライン引数に不正な値が指定されました. プログラムを終了します.");
			System.exit(1);	//プログラムを終了する
		}
		//コマンドライン引数が0以上2以下の時
		else if(num <= 2) {
			System.out.println("2未満の素数はありません.");
			System.exit(1);	//プログラムを終了する
		}
		else {
			int maxNum;	//最大素数を格納する変数の宣言
			maxNum = check(num);	//最大素数を格納s
			System.out.println(num + "未満の最大素数は"+maxNum);
		}
	}

}
