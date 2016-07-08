package extraTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args)
	{
		if(args.length == 0)
		{
			Scanner scan = new Scanner(System.in);
			List<Integer> array = new ArrayList<Integer>();
			boolean flag = true;
			while(flag)
			{
				System.out.print("数値を入力してください（Eで終了）：");
				String str = scan.next();
				if(str.equals("e") || str.equals("E"))
				{
					flag = false;
				}
				else
				{
					Integer num = 0;
					try
					{
						num = Integer.parseInt(str);
						array.add(num);
					}
					catch (NumberFormatException e)
					{
						System.out.println("数値もしくは'E'を入力してください");
					}
				}
			}
			int sum = 0;

			for(Integer num:array)
			{
				sum += num;
			}

			int size = array.size();
			 double ave  = sum / size;
			 System.out.println("入力された値の個数は:" + size);
			 System.out.println("入力された値の合計は:" + sum);
			 System.out.println("値の平均値は:" + ave);
		}
	}
}