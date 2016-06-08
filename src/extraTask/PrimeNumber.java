package extraTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try{
			System.out.println("自然数ｎを入力してください：");
			Integer n = Integer.parseInt(scan.next());
			System.out.println("自然数mを入力してください");
			Integer m = Integer.parseInt(scan.next());
			if(n < m){
				List<Integer> list = getPrimeNumberList(n, m);
				if(list != null){
					System.out.println(n + "から" + m + "までの範囲の素数は");
					for(int prime : list){
						System.out.println(prime);
					}
				}
			}
			else
			{
				List<Integer> list = getPrimeNumberList(m, n);
				if(list != null){
					System.out.println(m + "から" + n + "までの範囲の素数は");
					for(int prime : list){
						System.out.println(prime);
					}
				}
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("数値以外が入力されました");
			e.printStackTrace();
		}
		finally
		{
			scan.close();
		}
	}

	/**
	 * 指定した範囲の素数を検索し表示する
	 * @param n
	 * @param m
	 * @return
	 */
	public static List<Integer> getPrimeNumberList(int n, int m){
		List<Integer> primeNumberList = new ArrayList<Integer>();
		if(n < 0){//負の数は素数ではないのでメッセージを表示
			System.out.println("自然数以外が入力されました");
			return null;
		}
		if(n == 0 || n == 1){//0,1は素数ではないので2からスタートにする
			n = 2;
		}
		for(int i = n ; i <= m; i++){
			boolean flag = true;
			for(int j = 2; j < i ; j++){
				if(i % j == 0){//iが素数ではないならばflagをfalseにする
					flag = false;
					break;
				}
			}
			if(flag){
				primeNumberList.add(i);
			}
		}
		return primeNumberList;
	}
}
