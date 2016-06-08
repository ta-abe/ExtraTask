package extraTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShintyokuDoudesuka {

	public static void main(String args[]){
		randomDoudesuka();
	}

	public static void randomDoudesuka(){
		List<Integer> list = new ArrayList<Integer>();
		boolean flag = false;
		int i = 0;
		Random r = new Random();
		while(!flag){//FIXME ループ条件にはflagはなるべく使わない（分かりやすい名前を付ける）
			int j = r.nextInt(3);//util.randomなどを使う
			switch(j){
				case 0:System.out.print("進捗");
				break;
				case 1:System.out.print("どう");
				break;
				case 2:System.out.print("ですか？");
				break;
			}
			list.add(j);
			if(i >= 2){
				if(list.get(i) == 2 && list.get(i - 1) == 1 && list.get(i - 2) == 0){
					flag = true;
				}
			}
			i++;
		}
	}
}
