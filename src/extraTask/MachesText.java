package extraTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MachesText {
	public static void main(String args[]){
		String pathname;
		String keyword;
		Scanner scan = new Scanner(System.in);
		System.out.println("ファイルのパスを入力してください:");
		pathname = scan.next();
		System.out.println("検索したい文字列を入力してください:");
		keyword = scan.next();
		try {
			outputMatches(pathname, keyword);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void outputMatches(String pathname, String keyword) throws IOException{

		File file = null;
		FileReader filereader = null;
		BufferedReader br = null;
		try {
			file = new File(pathname);
			filereader = new FileReader(file);
			br = new BufferedReader(filereader);
			int lineNumber = 0;
			String str = null;
			while((str = br.readLine()) != null){
				lineNumber++;
				if(str.indexOf(keyword) != (-1)){
					System.out.println("行番号:" + lineNumber);
					System.out.println("該当行の内容:" + str);
				}
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(null != br){
				br.close();
			}
			if(null != filereader){
				filereader.close();
			}
		}
	}
}
