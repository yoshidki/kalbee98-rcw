import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * レシピ管理プログラム
 */
public class Recipe {

	public static void main(String... args){
		//パラメータチェック
		if(args == null || args.length == 0){
			return;
		}

		new Recipe().readFile(args[0]);
	}

	/**
	 * ファイル内容を出力
	 * @param name レシピファイル名
	 */
	public void readFile(String name){
		File recipe = new File(name);

		//TODO: try-with-resources 構文利用すべき
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(recipe), Charset.forName("UTF-8")));

			//XXX: 1行しか読み込めない。。。
			System.out.println(reader.readLine());
		} catch (IOException e) {
			// ファイルがない場合は無視する
		} finally{
			try {
				if(reader != null){
					reader.close();
				}
			} catch (IOException e) {
				// 読み込めなくても無視
			}
		}
	}
}
