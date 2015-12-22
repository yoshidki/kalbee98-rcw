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
	/** レシピファイルの文字コード定義 */
	private static String CHARSET = "UTF-8";

	public static void main(String... args) {
		// パラメータチェック
		if (args == null || args.length == 0) {
			System.out.println("error:main() args is empty.");
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
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(name)), Charset.forName(CHARSET)));) {
			for (String line; (line = reader.readLine()) != null;) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
			for (Throwable t : e.getSuppressed()) {
				t.printStackTrace();
			}
		}
	}
}
