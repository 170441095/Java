/**
 * 基本課題1.1　メインクラス
 * @author 170441095 竹内円来
 */

import java.util.Scanner;

public class Task11 {
	//getDownloadTimeメソッド
	static int[] getDownloadTime(int size,double throughput) {
		//使用する変数の宣言と定義
		int[] time = new int[3];
		long bsize;
		double second;
		
		bsize = (long)size * 1024L * 1024L * 1024L * 8L;	//GBからbitへの変換
		throughput = throughput * 1024 * 1024;	//Mbpsからbpsに変換
		second = bsize / throughput;	//ダウンロード時間を秒単位で算出

		time[0] = (int)second / 3600;	//時間に変換
		time[1] = ((int)second % 3600) / 60;	//あまりを分に変換
		time[2] = (int)second % 60;	//残った秒をそのまま代入

		return time;	//ダウンロード時間の文字列を返す
	}
	
	//メインメソッド
	public static void main (String[] args) {
		System.out.println("ファイルサイズ(GB):");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);	
		int size = scanner.nextInt();	//キーボードからファイルサイズを読み込む
		System.out.println("スループット(Mbps):");
		double throughput = scanner.nextDouble();	//Mbpsをキーボードから読み込む

		int[] time = new int[3];
		time = getDownloadTime(size,throughput);	//getDownloadTimeメソッドを呼び出し
		
		//1時間以上かかる時
		if(time[0] != 0){
		System.out.println("予測ダウンロード時間：" + time[0] + "時間" + time[1] + "分" + time[2] + "秒");
		}
		//1時間未満の時
		else {
			//1分以上の時
			if(time[1] != 0) {
				System.out.println("予測ダウンロード時間：" + time[1] + "分" + time[2] + "秒");
			}
			//1分未満の時
			else {
				System.out.println("予測ダウンロード時間：" + time[2] + "秒");
			}
		}
	}
}
