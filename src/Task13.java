/**
 * 基本課題1.3　メインクラス
 * @author 170441095 竹内円来
 */

public class Task13 {
	//データを表示するメソッド
	public static void showTable(String[][] data) {
		for(String[] array : data) {
			for(String n : array) {
				System.out.print(n + "\t");
			}
				System.out.println();
		}
	}

	//行と列を入れ替えるメソッド
	public static String[][] transpose(String[][] data) {
		String[][] destdata = new String[data[0].length][data.length];	//入れ替えたデータを格納するための配列変数の宣言
		for(int i=0; i<data.length;i++) {
			for(int j=0; j<data[0].length; j++) {
				destdata[j][i] = data[i][j];
			}
		}
		return destdata;	//入れ替えた文字配列を返す
	}

	//メインメソッド
	public static void main (String[] args) {
		//データの初期化
		String[][] data = {{"日付", "平均気温", "最高気温", "最低気温", "平均温度", "降水量"},
							{"9/1", "24.5", "26.9", "23.4", "85", "14.5"},
							{"9/2", "25.6", "30.6", "22.4", "72", "1.5"},
							{"9/3", "26.7", "2.3", "22.8", "68", "3.0"}
							};

		System.out.println("元の表：");
		showTable(data);	//入れ替える前のデータの表示
		System.out.println();	//改行
		String[][] destdata = transpose(data);	//行と列を入れ替えるメソッドの呼び出し
		System.out.println("入れ替え後の表：");
		showTable(destdata);	//入れ替えた後のデータの表示
	}
}
