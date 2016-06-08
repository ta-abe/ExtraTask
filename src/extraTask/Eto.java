package extraTask;

import java.util.Scanner;

public class Eto {
	/**
	 * メインメソッド,標準入力から西暦を入力し
	 * @param args
	 */
	public static void main(String args[]){
		System.out.println("西暦を入力してください");
		try{
			Scanner scan = new Scanner(System.in);
			int i = Integer.parseInt(scan.next());
			System.out.println(i + "年は" + getEto((int)i) + "年です");
		}
		catch(NumberFormatException e)
		{
			System.out.println("数値を入力してください");
			e.printStackTrace();
		}
	}

	/**
	 * 西暦を受け取ってその年の干支を返す
	 * @param year 西暦
	 * @return 干支
	 */
	public static String getEto(int year){
		String eto[] = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
		int i = (year +8)  % 12;
		return eto[i];
	}
}
