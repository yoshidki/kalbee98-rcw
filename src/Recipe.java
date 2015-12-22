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

	public static void main(String... args) {
		// パラメータチェック
		if (args == null || args.length == 0) {
			return;
		}

		new Recipe().readFile(args[0]);
	}

	/**
	 * ファイル内容を出力
	 * 
	 * @param name
	 *            レシピファイル名
	 */
	public void readFile(String name) {
		File recipe = new File(name);

		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(recipe), Charset.forName("UTF-8")));) {
			// XXX: 1行しか読み込めない。。。
			System.out.println(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
			for (Throwable t : e.getSuppressed()) {
				t.printStackTrace();
			}
		}
	}
}
