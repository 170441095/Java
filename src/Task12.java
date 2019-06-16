/**
 * 基本課題1.2　メインクラス
 * @author 170441095 竹内円来
 */

import java.util.Scanner;
import java.util.Random;

public class Task12 {
	//メインメソッド
	public static void main(String[] args) {
	int you,com;	//使用する変数の宣言
	System.out.println("#じゃんけんゲーム＃");
	System.out.println("じゃんけん");
	
	while(true) {
		System.out.println("(0:グー, 1:チョキ, 2:パー) > ");
		//ランダムにグー、チョキ、パーを決定する
		Random rand = new Random();
		com = rand.nextInt(2);
		@SuppressWarnings("resource")
		//プレーヤーがキーボードから入力したものを読み取る
		Scanner scanner = new Scanner(System.in);
		you = scanner.nextInt();
		//あいこの時は繰り返す
		if(you == com) {
			if(you == 0) System.out.println("ポン！　あなた「グー」, 相手「グー」　あいこで");
			else if(you == 1) System.out.println("ポン！　あなた「チョキ」,　相手「チョキ」　あいこで");
			else System.out.println("ポン！　あなた「パー」,　相手「パー」　あいこで");
		}
		//勝ち負けが決定した時ループ脱出
		else break;
	}
	
	//それぞれ結果を表示する
	if(you == 0 && com == 1)	System.out.println("ポン！　あなた「グー」,　相手「チョキ」　勝ち");
	else if(you == 1 && com == 2)	System.out.println("ポン！　あなた「チョキ」,　相手「パー」　勝ち");
	else if(you == 2 && com == 0)	System.out.println("ポン！　あなた「パー」,　相手「グー」　勝ち");
	else if(you == 1 && com == 0)	System.out.println("ポン！　あなた「チョキ」,　相手「グー」　負け");
	else if(you == 2 && com == 1)	System.out.println("ポン！　あなた「パー」,　相手「チョキ」　負け");
	else if(you == 0 && com == 2)	System.out.println("ポン！　あなた「グー」,　相手「パー」　負け");
	}
}
