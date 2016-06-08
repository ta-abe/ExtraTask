package extraTask;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {

	public static void main(String[] args) {
		List<Integer> fibonacciNumberList = getFibonacciNumberList(100);
		for(Integer i : fibonacciNumberList){
			System.out.println(i);//確認用
		}
	}

	/**
	 * 引数nを受け取り1-nまでのフィボナッチ数列を求める
	 * @param n フィボナッチ数列を求めたい範囲
	 * @return フィボナッチ数列が格納されたList
	 */
	public static List<Integer> getFibonacciNumberList(int n){
		List<Integer> fibonacciNumberList = new ArrayList<Integer>();
		Integer fibonacciNumber = 1;
		fibonacciNumberList.add(1);
		fibonacciNumberList.add(1);
		int i = 2;
		while(fibonacciNumber < n){
			Integer num = fibonacciNumberList.get(i - 2) + fibonacciNumberList.get(i -1);
			if(num < n){
				fibonacciNumberList.add(num);
				fibonacciNumber = num;
			}
			else
			{
				fibonacciNumber = num;
			}
			i++;
		}
		return fibonacciNumberList;
	}
}
